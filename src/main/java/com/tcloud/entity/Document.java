package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class Document {
    private String documentId;
    private byte[] entities;
    private byte[] states;

    @JsonIgnore
    private static ObjectMapper objectMapper;

    public static Document create() {
        return callAndHandleException(() -> {
            objectMapper = new ObjectMapper();
            return Document.builder()
                    .documentId(UUID.randomUUID().toString())
                    .entities(objectMapper.writeValueAsBytes(new HashMap<>()))
                    .states(objectMapper.writeValueAsBytes(new ArrayList<>()))
                    .build();
        });
    }

    public void putEntity(@NonNull final String key, @NonNull final byte[] value) {
        callAndHandleException(() -> {
            final Map<String, byte[]> deserializedEntities = getDeserializedEntities();
            deserializedEntities.put(key, value);
            entities = objectMapper.writeValueAsBytes(deserializedEntities);
            return null;
        });
    }

    public byte[] getEntity(@NonNull final String key) {
        return callAndHandleException(() -> {
            final Map<String, byte[]> deserializedEntities = getDeserializedEntities();
            return deserializedEntities.get(key);
        });
    }

    public String getEntityAsString(@NonNull final String key) {
        return callAndHandleException(() -> {
            final Map<String, byte[]> deserializedEntities = getDeserializedEntities();
            return objectMapper.writeValueAsString(deserializedEntities.get(key));
        });
    }

    public Map<String, byte[]> getDeserializedEntities() {
        return callAndHandleException(() ->
                objectMapper.readValue(entities, new TypeReference<Map<String, byte[]>>() {}));
    }

    private static <T> T callAndHandleException(@NonNull final Callable<T> func) {
        try {
            return func.call();
        } catch (final Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
