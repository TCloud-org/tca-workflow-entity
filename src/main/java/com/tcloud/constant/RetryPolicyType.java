package com.tcloud.constant;

import lombok.Getter;

@Getter
public enum RetryPolicyType {
    FIXED_RETRY("FixedRetry"),
    EXPONENTIAL_BACKOFF("ExponentialBackoff"),
    RANDOMIZED_EXPONENTIAL_BACKOFF("RandomizedExponentialBackoff"),
    LINEAR_BACKOFF("LinearBackoff"),
    CUSTOM_RETRY("CustomRetry"),
    CIRCUIT_BREAKER("CircuitBreaker");

    private final String value;

    RetryPolicyType(String value) {
        this.value = value;
    }

    public static RetryPolicyType of(String value) {
        for (RetryPolicyType type : RetryPolicyType.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
