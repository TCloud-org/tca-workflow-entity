package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class Document {
    private String documentId;
    private DocumentBody documentBody;
    private DocumentState documentState;

    @JsonIgnore
    private static ObjectMapper objectMapper;

    public static Document create() {
        return callAndHandleException(() -> {
            objectMapper = new ObjectMapper();
            return Document.builder()
                    .documentId(UUID.randomUUID().toString())
                    .documentBody(DocumentBody.create())
                    .documentState(DocumentState.create())
                    .build();
        });
    }

    public void putEntity(@NonNull final String key, @NonNull final byte[] value) {
        callAndHandleException(() -> {
            final Map<String, byte[]> entities = documentBody.getEntities();
            entities.put(key, value);
            documentBody = documentBody.toBuilder()
                    .entities(entities)
                    .build();
            return null;
        });
    }

    public byte[] getEntity(@NonNull final String key) {
        return documentBody.getEntities().get(key);
    }

    public String getEntityAsString(@NonNull final String key) {
        return callAndHandleException(() -> objectMapper.writeValueAsString(documentBody.getEntities().get(key)));
    }

    private static <T> T callAndHandleException(@NonNull final Callable<T> func) {
        try {
            return func.call();
        } catch (final Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}