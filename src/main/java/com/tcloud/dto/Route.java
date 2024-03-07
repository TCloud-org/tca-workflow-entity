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
    private Long routeId;

    private String workId;

    private String source;

    private String service;

    private String operation;

    private String resultType;

    private String resultName;

    private Long graphId;

    private ZonedDateTime createdAt;
}
