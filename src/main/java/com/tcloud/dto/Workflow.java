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
public class Workflow {
    private String workflowId;
    private String workflowName;
    private String clientId;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private Long nextAvailableVersion;
    private WorkflowMetadata metadata;
}
