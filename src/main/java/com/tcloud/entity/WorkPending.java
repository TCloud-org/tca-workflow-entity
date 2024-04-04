package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tcloud.constant.ActionType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@JsonTypeName("workPending")
public class WorkPending extends WorkResponse {

    private ZonedDateTime releasedAt;

    @Builder.Default
    private String actionType = ActionType.PENDING.getValue();
}

