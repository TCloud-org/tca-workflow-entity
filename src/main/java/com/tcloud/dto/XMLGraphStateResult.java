package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Builder(toBuilder = true)
@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLGraphStateResult {
    private String type;
    private String name;
    private String target;
}
