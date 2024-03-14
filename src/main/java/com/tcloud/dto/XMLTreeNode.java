package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Builder(toBuilder = true)
@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLTreeNode {
    private String id;
    private String name;

    @Builder.Default
    private List<XMLTreeNode> children = new ArrayList<>();

    public void addToChildren(@NonNull final XMLTreeNode node) {
        children.add(node);
    }
}