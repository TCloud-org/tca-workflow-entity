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
public class Graph {
    private String graphId;

    private String clientId;

    private String workflowName;

    private String description;

    private String alias;

    private GraphArch graphArch;

    private Long version;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;
}
