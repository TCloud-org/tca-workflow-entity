package com.tcloud.dto;

import com.tcloud.entity.Document;
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
public class RouteMetadata {
    private Document document;
    private DocumentEntityChangeLog documentEntityChangeLog;
    private WorkflowRunConfiguration workflowConfiguration;
}
