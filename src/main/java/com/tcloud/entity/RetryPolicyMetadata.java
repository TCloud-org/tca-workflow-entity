package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetryPolicyMetadata {

    private List<Double> retryStimulation;

    public static RetryPolicyMetadata create() {
        return RetryPolicyMetadata.builder()
                .retryStimulation(new ArrayList<>())
                .build();
    }
}
