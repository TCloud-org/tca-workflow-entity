package com.tcloud.entity.identifier;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
public class RouteIdentifier extends Identifier {
    public static final String ROOT = "route";

    private String clientId;
    private String workflowName;
    private String version;
    private String runningOrder;
}
