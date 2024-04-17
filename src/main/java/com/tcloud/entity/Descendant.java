package com.tcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tcloud.Translator.HTMLTranslator;
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

    public String getHtml() {
        return HTMLTranslator.from(this);
    }

    public String getTextContentTag() {
        if (type == null) {
            return "";
        }

        switch (type) {
            case "block-quote" -> {
                return "blockquote";
            }
            case "bulleted-list" -> {
                return "ul";
            }
            case "heading-one" -> {
                return "h1";
            }
            case "heading-two" -> {
                return "h2";
            }
            case "heading-three" -> {
                return "h3";
            }
            case "heading-four" -> {
                return "h4";
            }
            case "heading-five" -> {
                return "h5";
            }
            case "heading-six" -> {
                return "h6";
            }
            case "list-item" -> {
                return "li";
            }
            case "numbered-list" -> {
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
