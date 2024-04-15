package com.tcloud.dto;

import com.tcloud.constant.WorkflowEventBusService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class WorkflowEventBusDetail {
    private WorkflowEventBusService service;
    private String eventId;
    private Long workflowId;
    private int stepIndex;
}
