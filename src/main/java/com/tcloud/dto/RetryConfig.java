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
public class RetryConfig {
    private long retryPolicyId;
    private int retryIndex;

    public static RetryConfig create() {
        return RetryConfig.builder()
                .retryIndex(-1)
                .build();
    }
}
