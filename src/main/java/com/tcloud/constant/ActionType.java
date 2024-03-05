package com.tcloud.constant;

public enum ActionType {
    SUCCESS("success"),
    FAILURE("failure"),
    PENDING("pending"),
    DEFAULT("default-state");

    private final String value;

    ActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ActionType of(String value) {
        for (ActionType state : ActionType.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
