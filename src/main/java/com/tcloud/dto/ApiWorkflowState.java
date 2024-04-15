package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiWorkflowState {
    private Long stateId;
    private Long graphId;
    private String stateType;
    private String source;
    private String service;
    private String operation;
    private Integer runningOrder;
    private Long retryPolicyId;
    private Integer duration;
    private String unit;
    private String workResultType;
    private String workResultName;
    private String workResultTarget;
    private ZonedDateTime createdAt;
}
