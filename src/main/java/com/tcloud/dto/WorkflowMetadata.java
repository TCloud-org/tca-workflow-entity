package com.tcloud.dto;

import com.tcloud.entity.RetentionPeriod;
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
public class WorkflowMetadata {

    private RetentionPeriod retentionPeriod;
}
