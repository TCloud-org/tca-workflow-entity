package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.dto.Configuration;
import com.tcloud.dto.RetryConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNullElse;

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

    public WorkflowConfiguration merge(@NonNull final WorkflowConfiguration other) {
        return this.toBuilder()
                .workflowEndpointConfig(requireNonNullElse(other.getWorkflowEndpointConfig(), this.workflowEndpointConfig))
                .stateEndpointConfigMap(merge(this.stateEndpointConfigMap, other.getStateEndpointConfigMap()))
                .serviceEndpointConfigMap(merge(this.serviceEndpointConfigMap, other.getServiceEndpointConfigMap()))
                .workflowRetryConfig(
                        nonNull(other.getWorkflowRetryConfig())
                                ? other.getWorkflowRetryConfig()
                                : this.workflowRetryConfig
                )
                .stateRetryConfigMap(merge(this.stateRetryConfigMap, other.getStateRetryConfigMap()))
                .modifiedAt(ZonedDateTime.now(ZoneId.of("UTC")))
                .build();
    }

    private <T> Map<String, T> merge(@NonNull Map<String, T> m1, @NonNull Map<String, T> m2) {
        final Map<String, T> mergedMap = new HashMap<>(m1);

        for (Map.Entry<String, T> entry : m2.entrySet()) {
            final String key = entry.getKey();
            final T value = entry.getValue();

            if (value != null) {
                mergedMap.put(key, value);
            }
        }

        return mergedMap;
    }
}
