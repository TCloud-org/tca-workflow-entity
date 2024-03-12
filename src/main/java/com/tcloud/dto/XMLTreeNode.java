package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Builder(toBuilder = true)
@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLTreeNode {
    private String id;
    private String name;
    private List<XMLTreeNode> children;
}
