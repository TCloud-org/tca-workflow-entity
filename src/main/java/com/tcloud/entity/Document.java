package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcloud.Serializer;
import com.tcloud.dto.DocumentEntityChangeLog;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

import static com.tcloud.utility.DocumentUtility.getEntityDiff;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
    private String documentId;
    private DocumentBody documentBody;

    @JsonIgnore
    private static ObjectMapper objectMapper;

    public static Document create() {
        return callAndHandleException(() -> {
            objectMapper = new ObjectMapper();
            return Document.builder()
                    .documentId(UUID.randomUUID().toString())
                    .documentBody(DocumentBody.create())
                    .build();
        });
    }

    public void merge(final Document other) {
        if (other == null) {
            return;
        }
        final DocumentEntityChangeLog changeLog = getEntityDiff(this, other);
        changeLog.getAdded().forEach(this::putEntity);
        changeLog.getModified().forEach(this::putEntity);
        changeLog.getRemoved().keySet().forEach(this::removeEntity);
    }

    public void putEntity(@NonNull final String key, final byte[] value) {
        callAndHandleException(() -> {
            final Map<String, byte[]> entities = documentBody.getEntities();
            entities.put(key, value);
            documentBody = documentBody.toBuilder()
                    .entities(entities)
                    .build();
            return null;
        });
    }

    public void putEntity(@NonNull final String key, final Object value) {
        callAndHandleException(() -> {
            final Map<String, byte[]> entities = documentBody.getEntities();
            entities.put(key, Serializer.serializeAsBytes(value));
            documentBody = documentBody.toBuilder()
                    .entities(entities)
                    .build();
            return null;
        });
    }

    public void removeEntity(@NonNull final String key) {
        callAndHandleException(() -> {
            final Map<String, byte[]> entities = documentBody.getEntities();
            entities.remove(key);
            documentBody = documentBody.toBuilder()
                    .entities(entities)
                    .build();
            return null;
        });
    }

    public byte[] getEntity(@NonNull final String key) {
        return documentBody.getEntities().get(key);
    }

    public <T> T extractEntityByType(@NonNull final String key,
                                     @NonNull final Class<T> classType) {
        return Serializer.deserialize(documentBody.getEntities().get(key), classType);
    }

    public String getEntityAsString(@NonNull final String key) {
        return callAndHandleException(() -> objectMapper.writeValueAsString(documentBody.getEntities().get(key)));
    }

    public Document deepCopy() {
        final byte[] src = Serializer.serializeAsBytes(this);
        return Serializer.deserialize(src, Document.class);
    }

    private static <T> T callAndHandleException(@NonNull final Callable<T> func) {
        try {
            return func.call();
        } catch (final Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
