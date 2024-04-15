package com.tcloud.dto;

import com.tcloud.constant.WorkflowEventBusService;
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
public class EmailNotificationEventBusDetail extends WorkflowEventBusDetail {
    private String eventId;
    private Long workflowId;
    private int stepIndex;

    public EmailNotificationEventBusDetail(final String eventId,
                                           final Long workflowId,
                                           final Integer stepIndex) {
        super(WorkflowEventBusService.EMAIL_NOTIFICATION);
        this.eventId = eventId;
        this.workflowId = workflowId;
        this.stepIndex = stepIndex;
    }

    public EmailNotificationEventBusDetailBuilder<?, ?> create() {
        return EmailNotificationEventBusDetail.builder()
                .service(WorkflowEventBusService.EMAIL_NOTIFICATION);
    }
}
