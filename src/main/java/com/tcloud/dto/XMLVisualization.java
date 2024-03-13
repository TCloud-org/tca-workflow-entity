package com.tcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class XMLVisualization {
    @Builder.Default
    private List<XMLVisualNode> nodes = new ArrayList<>();

    @Builder.Default
    private List<XMLVisualEdge> edges = new ArrayList<>();

    private XMLTreeNode treeNode;

    @Builder.Default
    private List<String> treeNodeIds = new ArrayList<>();
}
