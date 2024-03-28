package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.dto.Configuration;
import com.tcloud.dto.RetryConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowConfiguration {
    private Long workflowConfigurationId;

    private String workId;

    private String clientId;

    private Configuration workflowEndpointConfig;

    private Map<String, Configuration> stateEndpointConfigMap;

    private Map<String, Configuration> serviceEndpointConfigMap;

    private RetryConfig workflowRetryConfig;

    private Map<String, RetryConfig> stateRetryConfigMap;

    private ZonedDateTime modifiedAt;
}
