package com.tcloud.constant;

import lombok.Getter;

@Getter
public enum EmailStepType {
    EMAIL("email"),
    DELAY("delay");

    private final String value;

    EmailStepType(String value) {
        this.value = value;
    }

    public static EmailStepType of(String value) {
        for (EmailStepType state : EmailStepType.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
