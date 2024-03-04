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
        try {
            objectMapper = new ObjectMapper();
            return Document.builder()
                    .documentId(UUID.randomUUID().toString())
                    .entities(objectMapper.writeValueAsBytes(new HashMap<>()))
                    .states(objectMapper.writeValueAsBytes(new ArrayList<>()))
                    .build();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return Document.builder().build();
    }

    public void putEntity(@NonNull final String key, @NonNull final byte[] value) {
        try {
            final Map<String, byte[]> deserializedEntities =
                    objectMapper.readValue(entities, new TypeReference<Map<String, byte[]>>() {});
            deserializedEntities.put(key, value);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
