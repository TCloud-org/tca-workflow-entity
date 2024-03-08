package com.tcloud.constant;

public enum Environment {
    PROD,
    DEV;

    public static Environment of(String value) {
        if (value != null) {
            for (Environment env : Environment.values()) {
                if (value.equalsIgnoreCase(env.name())) {
                    return env;
                }
            }
        }
        throw new IllegalArgumentException("Invalid environment: " + value);
    }
}
