package com.tcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class XMLVisualization {
    @NonNull
    private List<XMLVisualNode> nodes;

    @NonNull
    private List<XMLVisualEdge> edges;

    private XMLTreeNode treeNode;
}
