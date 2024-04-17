package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.Translator.HTMLTranslator;
import com.tcloud.constant.ElementType;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Descendant {
    private ElementType type;
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

    public String getHtml() {
        return HTMLTranslator.from(this);
    }

    public String getTextContentTag() {
        switch (type) {
            case BLOCK_QUOTE -> {
                return "blockquote";
            }
            case BULLETED_LIST -> {
                return "ul";
            }
            case HEADING_ONE -> {
                return "h1";
            }
            case HEADING_TWO -> {
                return "h2";
            }
            case HEADING_THREE -> {
                return "h3";
            }
            case HEADING_FOUR -> {
                return "h4";
            }
            case HEADING_FIVE -> {
                return "h5";
            }
            case HEADING_SIX -> {
                return "h6";
            }
            case LIST_ITEM -> {
                return "li";
            }
            case NUMBERED_LIST -> {
                return "ol";
            }
            default -> {
                return "p";
            }
        }
    }

    public String getTextSemanticTag() {
        if (bold) {
            return "strong";
        }
        if (code) {
            return "code";
        }
        if (italic) {
            return "em";
        }
        if (underline) {
            return "u";
        }
        return "span";
    }
}
