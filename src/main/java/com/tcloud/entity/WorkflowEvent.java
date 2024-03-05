package com.tcloud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class WorkflowEvent {

    private Document document;
    private String currentState;
    private String nextState;
    private ZonedDateTime sentAt;
}
