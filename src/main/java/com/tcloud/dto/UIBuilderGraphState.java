package com.tcloud.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
public class UIBuilderGraphState {
    private String name;
    private String service;
    private String operation;
    private List<UIBuilderGraphBranch> branches;
}
