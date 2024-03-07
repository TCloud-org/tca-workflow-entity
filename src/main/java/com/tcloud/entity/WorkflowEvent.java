package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tcloud.dto.Graph;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
public class WorkflowEvent {

    @JsonProperty("document")
    private Document document;

    @JsonProperty("currentState")
    private String currentState;

    @JsonProperty("nextState")
    private String nextState;

    @JsonProperty("graph")
    private Graph graph;

    @JsonProperty("sentAt")
    private ZonedDateTime sentAt;
}
