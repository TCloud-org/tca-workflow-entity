package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;

@Builder(toBuilder = true)
@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLParsedGraphResult {
    private String initialState;
    private Map<String, XMLGraphState> result;
    private Long retryPolicyId;
}
