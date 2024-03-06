package com.tcloud.constant;

public enum WorkflowState {
    PRE_START("pre-start"),
    INITIAL("initial-state"),
    TERMINAL("terminal");

    private final String value;

    WorkflowState(String state) {
        this.value = state;
    }

    public String getValue() {
        return value;
    }

    public static WorkflowState of(String value) {
        for (WorkflowState state : WorkflowState.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
