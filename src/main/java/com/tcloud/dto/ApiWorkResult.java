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
public class ApiWorkResult {
    private Long workResultId;
    private Long stateId;
    private String workResultType;
    private String workResultName;
    private String workResultTarget;
    private ZonedDateTime createdAt;
    private ApiWorkflowState state;
}
