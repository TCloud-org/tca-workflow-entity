package com.tcloud.entity;

import com.tcloud.dto.DocumentEntityChangeLog;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class DocumentBody {
    private Map<String, byte[]> entities;
    private DocumentEntityChangeLog changeLog;

    public static DocumentBody create() {
        return DocumentBody.builder()
                .entities(new HashMap<>())
                .build();
    }
}
