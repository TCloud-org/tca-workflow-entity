package com.tcloud.entity;

import com.tcloud.constant.ActionType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
public class WorkFailure extends WorkResponse {
    @Builder.Default
    private String actionType = ActionType.FAILURE.getValue();

    private Exception exception;

    public WorkFailure(@NonNull final String actionName) {
        super(null, ActionType.FAILURE.getValue(), actionName);
    }

    public WorkFailure(@NonNull final String actionName,
                       @NonNull final Document document) {
        super(document, ActionType.FAILURE.getValue(), actionName);
    }

    public WorkFailure(@NonNull final String actionName,
                       @NonNull final Exception exception) {
        super(null, ActionType.FAILURE.getValue(), actionName);
        this.exception = exception;
    }

    public WorkFailure(@NonNull final String actionName,
                       @NonNull final Document document,
                       @NonNull final Exception exception) {
        super(document, ActionType.FAILURE.getValue(), actionName);
        this.exception = exception;
    }
}
