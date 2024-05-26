package com.tcloud.constant;

import lombok.Getter;

@Getter
public enum ActionType {
    NOTIFIED("notified"),
    SUCCESS("success"),
    FAILURE("failure"),
    PENDING("pending"),
    DEFAULT("default");

    private final String value;

    ActionType(String value) {
        this.value = value;
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
