package com.tcloud.dto;

import com.tcloud.constant.WorkflowEventBusService;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@ToString(callSuper = true)
public class EmailNotificationEventBusDetail extends WorkflowEventBusDetail {
    private String eventId;
    private Long workflowId;
    private int stepIndex;

    public static EmailNotificationEventBusDetailBuilder<?, ?> create() {
        return EmailNotificationEventBusDetail.builder()
                .service(WorkflowEventBusService.EMAIL_NOTIFICATION)
                .sentAt(ZonedDateTime.now(ZoneId.of("UTC")));
    }
}
