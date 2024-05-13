package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class StepWorkflowBilling {
    long totalTransitions;
    long deductibleTransitions;
    long pricePerUnit;
    long cost;
    ZonedDateTime startDate;
}
