package com.tcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@ToString
public class WorkflowRunConfiguration {
    private Configuration workflowConfiguration;
    private List<Configuration> stateConfigurations;
    private List<Configuration> serviceConfigurations;

    public static WorkflowRunConfiguration create() {
        return WorkflowRunConfiguration.builder()
                .stateConfigurations(new ArrayList<>())
                .serviceConfigurations(new ArrayList<>())
                .build();
    }
}
