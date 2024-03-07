package com.tcloud.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Builder(toBuilder = true)
@Data
@Jacksonized
public class XMLParsedGraphResult {
    private String initialState;
    private Map<String, XMLGraphState> result;
}
