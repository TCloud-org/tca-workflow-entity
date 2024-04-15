package com.tcloud.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventWorkflowTriggerMethod {
    CODE("code"),
    WEBHOOK("webhook");

    private final String value;

    public static EventWorkflowTriggerMethod of(String value) {
        for (EventWorkflowTriggerMethod state : EventWorkflowTriggerMethod.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
