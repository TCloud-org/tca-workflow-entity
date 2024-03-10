package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.dto.DocumentEntityChangeLog;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentBody {
    private Map<String, byte[]> entities;
    private List<DocumentEntityChangeLog> changeLogs;

    public static DocumentBody create() {
        return DocumentBody.builder()
                .entities(new HashMap<>())
                .changeLogs(new ArrayList<>())
                .build();
    }
}
