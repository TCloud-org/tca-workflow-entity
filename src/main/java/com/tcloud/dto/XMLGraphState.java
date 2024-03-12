package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Builder(toBuilder = true)
@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLGraphState {
    private String type;
    private String source;
    private String service;
    private String operation;
    private Integer runningOrder;
    private Integer duration;
    private TimeUnit unit;
    private Map<String, XMLGraphStateResult> resultMap;
}
