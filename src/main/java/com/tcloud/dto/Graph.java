package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Graph {
    @Min(1)
    private Long graphId;

    @Min(1)
    private Long workflowId;

    private String clientId;

    private String description;

    private String alias;

    @NotBlank
    private String xmlContent;

    private XMLParsedGraphResult parsedGraphResult;

    private GraphArch graphArch;

    @Min(1)
    private Long version;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private ZonedDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private ZonedDateTime updatedAt;
}
