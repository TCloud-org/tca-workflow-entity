package com.tcloud.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClauseConditionType {
    IN("IN"),
    NOT_IN("NOT IN");

    private final String value;

    public static ClauseConditionType of(String value) {
        for (ClauseConditionType state : ClauseConditionType.values()) {
            if (state.value.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
