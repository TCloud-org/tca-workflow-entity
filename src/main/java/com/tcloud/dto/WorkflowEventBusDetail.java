package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tcloud.constant.WorkflowEventBusService;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = EmailNotificationEventBusDetail.class, name = "emailNotificationEventBusDetail"),
})
public class WorkflowEventBusDetail {
    private WorkflowEventBusService service;
    private ZonedDateTime sentAt;
    private String clientId;
}
