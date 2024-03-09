package com.tcloud.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Builder(toBuilder = true)
@Data
@Jacksonized
public class XMLGraphStateResult {
    private String type;
    private String name;
    private String target;
}
