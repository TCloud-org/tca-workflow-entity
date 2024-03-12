package com.tcloud.entity;

import com.tcloud.constant.ActionType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
public class WorkPending extends WorkResponse {

    private ZonedDateTime releasedAt;

    @Builder.Default
    private String actionType = ActionType.PENDING.getValue();

    public WorkPending(@NonNull final String actionName) {
        super(null, ActionType.PENDING.getValue(), actionName);
    }

    public WorkPending(@NonNull final String actionName,
                       @NonNull final Document document) {
        super(document, ActionType.PENDING.getValue(), actionName);
    }

    public WorkPending(@NonNull final String actionName,
                       @NonNull final ZonedDateTime releasedAt) {
        super(null, ActionType.PENDING.getValue(), actionName);
        this.releasedAt = releasedAt;
    }

    public WorkPending(@NonNull final String actionName,
                       @NonNull final Document document,
                       @NonNull final ZonedDateTime releasedAt) {
        super(document, ActionType.PENDING.getValue(), actionName);
        this.releasedAt = releasedAt;
    }
}

