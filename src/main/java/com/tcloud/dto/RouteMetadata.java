package com.tcloud.dto;

import com.tcloud.entity.Document;
import com.tcloud.entity.StateNotification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class RouteMetadata {
    private Document document;
    private DocumentEntityChangeLog documentEntityChangeLog;
    private WorkflowRunConfiguration workflowConfiguration;
    private String error;
    private StateNotification notification;
    private RetryConfig workflowRetryConfig;
    private Map<String, RetryConfig> stateRetryConfigMap;

    public static RouteMetadata create() {
        return RouteMetadata.builder()
                .document(Document.create())
                .documentEntityChangeLog(DocumentEntityChangeLog.create())
                .workflowConfiguration(WorkflowRunConfiguration.create())
                .notification(StateNotification.create())
                .workflowRetryConfig(RetryConfig.create())
                .stateRetryConfigMap(new HashMap<>())
                .build();
    }
}
