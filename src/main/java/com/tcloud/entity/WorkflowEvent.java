package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowEvent {

    @JsonProperty("workId")
    private String workId;

    @JsonProperty("document")
    private Document document;

    @JsonProperty("source")
    private String source;

    @JsonProperty("graph")
    private Graph graph;

    @JsonProperty("sentAt")
    private ZonedDateTime sentAt;
}
