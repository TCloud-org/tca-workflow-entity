package com.tcloud.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WorkflowState {
    START("Start"),
    END("End");

    private final String value;

    public static WorkflowState of(String value) {
        for (WorkflowState state : WorkflowState.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
