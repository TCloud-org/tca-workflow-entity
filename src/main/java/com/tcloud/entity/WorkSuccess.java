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
@JsonTypeName("workSuccess")
public class WorkSuccess extends WorkResponse {

    @Builder.Default
    private String actionType = ActionType.SUCCESS.getValue();
}
