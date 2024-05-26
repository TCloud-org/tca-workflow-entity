package com.tcloud.entity.identifier;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Jacksonized
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = WorkIdentifier.class, name = "workIdentifier"),
})
public class Identifier {
    private String idempotentKey;
}
