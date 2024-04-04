package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tcloud.constant.ActionType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@JsonTypeName("workFailure")
public class WorkFailure extends WorkResponse {
    @Builder.Default
    private String actionType = ActionType.FAILURE.getValue();

    private Exception exception;

    public WorkFailure(final String actionName) {
        super(null, ActionType.FAILURE.getValue(), actionName);
    }

    public WorkFailure(final String actionName,
                       final Document document) {
        super(document, ActionType.FAILURE.getValue(), actionName);
    }

    public WorkFailure(final String actionName,
                       final Exception exception) {
        super(null, ActionType.FAILURE.getValue(), actionName);
        this.exception = exception;
    }

    public WorkFailure(final String actionName,
                       final Document document,
                       final Exception exception) {
        super(document, ActionType.FAILURE.getValue(), actionName);
        this.exception = exception;
    }
}
