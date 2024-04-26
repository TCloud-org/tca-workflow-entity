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
import java.util.List;
import java.util.Map;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@ToString(callSuper = true)
public class EmailNotificationEventBusDetail extends WorkflowEventBusDetail {
    private String eventId;
    private Long workflowId;
    private Long jobId;
    private int stepIndex;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private Map<String, String> subjectMap;
    private Map<String, String> bodyMap;

    public static EmailNotificationEventBusDetailBuilder<?, ?> create() {
        return EmailNotificationEventBusDetail.builder()
                .service(WorkflowEventBusService.EMAIL_NOTIFICATION)
                .sentAt(ZonedDateTime.now(ZoneId.of("UTC")));
    }
}
