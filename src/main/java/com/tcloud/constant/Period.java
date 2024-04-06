package com.tcloud.constant;

import lombok.Getter;

@Getter
public enum Period {
    TODAY("TODAY"),
    YESTERDAY("YESTERDAY"),
    LAST_WEEK("LAST_WEEK"),
    LAST_MONTH("LAST_MONTH");

    private final String value;

    Period(String value) {
        this.value = value;
    }

    public static Period of(String value) {
        for (Period option : Period.values()) {
            if (option.value.equalsIgnoreCase(value)) {
                return option;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found");
    }
}

