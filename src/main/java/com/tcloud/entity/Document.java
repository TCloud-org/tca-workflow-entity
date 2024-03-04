package com.tcloud.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class Document {
    private String documentId;
    private byte[] entities;
    private byte[] states;

    public static Document create() {
        try {
            final ObjectMapper objectMapper = new ObjectMapper();
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
}
