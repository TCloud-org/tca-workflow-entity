package com.tcloud.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Builder(toBuilder = true)
@Data
@Jacksonized
public class XMLGraphStateResult {
    private Map<String, XMLGraphStateResultBody> resultMap;
}
