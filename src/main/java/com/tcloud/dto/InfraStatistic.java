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
    private int totalWorkflows;
    private int totalGraphs;
    private int totalServices;
    private int totalRetryPolicies;
    private int totalAuthTokens;
}
