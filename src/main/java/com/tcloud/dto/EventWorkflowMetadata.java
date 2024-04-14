package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.entity.EventWorkflowStep;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventWorkflowMetadata {
    List<EventWorkflowStep> steps;
}
