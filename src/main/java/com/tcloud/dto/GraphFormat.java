package com.tcloud.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tcloud.entity.WorkFailure;
import com.tcloud.entity.WorkPending;
import com.tcloud.entity.WorkSuccess;
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
        @JsonSubTypes.Type(value = XMLGraphFormat.class, name = "xmlGraphFormat"),
        @JsonSubTypes.Type(value = UIBuilderGraphFormat.class, name = "uiBuilderGraphFormat"),
})
public class GraphFormat {
}
