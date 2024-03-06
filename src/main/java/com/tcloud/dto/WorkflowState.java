package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
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
public class WorkflowState {

    @Min(value = 1)
    private Long workflowStateId;

    @Min(value = 1)
    private Long graphId;

    private String serviceName;

    private String operationName;

    private String apiEndpoint;

    private String envState;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private ZonedDateTime executedAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private ZonedDateTime scheduledAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private ZonedDateTime updatedAt;

    private String requestId;

    private String request;

    private String response;

    private String failure;

    @Min(value = 1)
    private Long nextWorkflowStateId;

    @Min(value = 1)
    private Long version;
}
