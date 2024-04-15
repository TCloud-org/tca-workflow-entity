package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Descendant {
    private String type;
    private List<Descendant> children;
    private String language;
    private String url;
    private String character;
    private boolean checked;
    private boolean bold;
    private boolean italic;
    private boolean code;
    private String text;
    private boolean underline;
    private String align;
}
