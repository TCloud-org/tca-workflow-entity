package com.tcloud.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
public class UIBuilderGraphBranch {
    private String type;
    private String name;
    private String target;
}
