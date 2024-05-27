package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Work {

    private String workId;

    private String idempotentKey;

    private String clientId;

    private String source;

    private String service;

    private String operation;

    private String resultType;

    private String resultName;

    private String graphId;

    private String workflowId;

    private Long version;

    private Integer runningOrder;

    private Long executionTime;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

    private String retryScheduleId;

    private ZonedDateTime nextRetryAt;

    private RouteMetadata metadata;
}

