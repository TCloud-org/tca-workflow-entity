package com.tcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class DocumentEntityChangeLog {
    private Map<String, byte[]> added;
    private Map<String, byte[]> removed;
    private Map<String, byte[]> modified;
}
