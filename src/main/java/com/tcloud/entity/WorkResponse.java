package com.tcloud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class WorkResponse {
    private Document document;
    private String actionType;
    private String actionName;
}
