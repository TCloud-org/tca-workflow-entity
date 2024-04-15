package com.tcloud.constant;

import lombok.Getter;

@Getter
public enum EventWorkflowStepType {
    EMAIL("email"),
    DELAY("delay"),
    TRIGGER("trigger");

    private final String value;

    EventWorkflowStepType(String value) {
        this.value = value;
    }

    public static EventWorkflowStepType of(String value) {
        for (EventWorkflowStepType state : EventWorkflowStepType.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
