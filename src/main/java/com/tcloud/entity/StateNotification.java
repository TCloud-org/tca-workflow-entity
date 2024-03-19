package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class StateNotification {
    private String resultType;
    private String resultName;
    private Document document;
    private ZonedDateTime notifiedAt;

    public static StateNotification create() {
        return StateNotification.builder()
                .document(Document.create())
                .build();
    }
}
