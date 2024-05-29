package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.constant.RetryPolicyType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetryPolicy {

    private String retryPolicyId;

    private String name;

    private String clientId;

    private RetryPolicyType policyType;

    private int numberOfRetries;

    private int delay;

    private int initialDelay;

    private float multiplierFactor;

    private int maxRetries;

    private int maxDelay;

    private float randomizationFactor;

    private int delayIncrement;

    private String retryConditions;

    private String delayStrategy;

    private String backoffStrategy;

    private int threshold;

    private int resetTime;

    private float failureThreshold;

    private int retryInterval;

    private RetryPolicyMetadata metadata;
}
