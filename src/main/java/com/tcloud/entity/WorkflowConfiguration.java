package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.dto.Configuration;
import com.tcloud.dto.RetryConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.sql.Timestamp;
import java.util.List;
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

    private List<Configuration> stateEndpointConfigs;

    private List<Configuration> serviceEndpointConfigs;

    private RetryConfig workflowRetryConfig;

    private Map<String, RetryConfig> stateRetryConfigMap;

    private Timestamp modifiedAt;
}
