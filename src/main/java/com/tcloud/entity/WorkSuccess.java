package com.tcloud.entity;

import com.tcloud.constant.ActionType;
import lombok.AllArgsConstructor;
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
public class WorkSuccess extends WorkResponse {

    @Builder.Default
    private String actionType = ActionType.SUCCESS.getValue();

    public WorkSuccess(@NonNull final String actionName) {
        super(null, ActionType.SUCCESS.getValue(), actionName);
    }

    public WorkSuccess(@NonNull final String actionName,
                       @NonNull final Document document) {
        super(document, ActionType.SUCCESS.getValue(), actionName);
    }
}
