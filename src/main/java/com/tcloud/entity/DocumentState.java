package com.tcloud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class DocumentState {
    private List<byte[]> states;

    public static DocumentState create() {
        return DocumentState.builder()
                .states(new ArrayList<>())
                .build();
    }
}
