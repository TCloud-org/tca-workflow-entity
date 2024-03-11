package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentEntityChangeLog {
    private Map<String, byte[]> added;
    private Map<String, byte[]> removed;
    private Map<String, byte[]> modified;
    private ZonedDateTime createdAt;
}
