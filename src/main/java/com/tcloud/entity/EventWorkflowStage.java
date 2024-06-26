package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.constant.EventWorkflowStatus;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventWorkflowStage {
    private Long stageId;
    private Long jobId;
    private String clientId;
    private EventWorkflowStep step;
    private Integer stepIndex;
    private EventWorkflowStatus status;
    private ZonedDateTime executedAt;
}
