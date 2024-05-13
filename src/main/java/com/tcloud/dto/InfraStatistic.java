package com.tcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class InfraStatistic {
    private long totalWorkflows;
    private long totalGraphs;
    private long totalServices;
    private long totalRetryPolicies;
    private long totalAuthTokens;
}
