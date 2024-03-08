package com.tcloud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class WorkRequest {
    private String workId;
    private Document document;
}
