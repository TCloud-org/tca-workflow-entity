package com.tcloud.entity;

import com.tcloud.constant.EventWorkflowTriggerMethod;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@ToString(callSuper = true)
public class TriggerForm extends EventWorkflowForm {
    private EventWorkflowTriggerMethod method;
}
