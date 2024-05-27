package com.tcloud.dto;

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
public class Route {
    private String routeId;

    private String idempotentKey;

    private String clientId;

    private String graphId;

    private String workflowId;

    private String workId;

    private String source;

    private String service;

    private String operation;

    private String resultType;

    private String resultName;

    private ZonedDateTime createdAt;

    private Long version;

    private Integer runningOrder;

    private Long executionTime;

    private String retryScheduleId;

    private ZonedDateTime nextRetryAt;

    private RouteMetadata metadata;
}
