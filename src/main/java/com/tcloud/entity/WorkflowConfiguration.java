package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.dto.Configuration;
import com.tcloud.dto.RetryConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowConfiguration {
    private String workflowConfigurationId;

    private String workId;

    private String clientId;

    private Configuration workflowEndpointConfig;

    @Builder.Default
    private Map<String, Configuration> stateEndpointConfigMap = new HashMap<>();

    @Builder.Default
    private Map<String, Configuration> serviceEndpointConfigMap = new HashMap<>();

    private RetryConfig workflowRetryConfig;

    @Builder.Default
    private Map<String, RetryConfig> stateRetryConfigMap = new HashMap<>();

    @Builder.Default
    private ZonedDateTime modifiedAt = ZonedDateTime.now(ZoneId.of("UTC"));

    private Long version;

    public static WorkflowConfiguration init() {
        return WorkflowConfiguration.builder()
                .build();
    }
}
