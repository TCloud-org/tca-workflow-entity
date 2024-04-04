package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = WorkFailure.class, name = "workFailure"),
        @JsonSubTypes.Type(value = WorkPending.class, name = "workPending"),
        @JsonSubTypes.Type(value = WorkSuccess.class, name = "workSuccess")
})
public class WorkResponse {
    private Document document;
    private String actionType;
    private String actionName;
}
