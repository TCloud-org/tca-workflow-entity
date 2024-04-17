package com.tcloud.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ElementType {
    BLOCK_QUOTE("block-quote"),
    BULLETED_LIST("bulleted-list"),
    CHECK_LIST_ITEM("check-list-item"),
    EDITABLE_VOID("editable-void"),
    HEADING_ONE("heading-one"),
    HEADING_TWO("heading-two"),
    HEADING_THREE("heading-three"),
    HEADING_FOUR("heading-four"),
    HEADING_FIVE("heading-five"),
    HEADING_SIX("heading-six"),
    IMAGE("image"),
    LINK("link"),
    BUTTON("button"),
    BADGE("badge"),
    LIST_ITEM("list-item"),
    NUMBERED_LIST("numbered-list"),
    MENTION("mention"),
    PARAGRAPH("paragraph"),
    TABLE("table"),
    TABLE_CELL("table-cell"),
    TABLE_ROW("table-row"),
    TITLE("title"),
    VIDEO("video"),
    CODE_BLOCK("code-block"),
    CODE_LINE("code-line");

    private final String type;

    public static ElementType of(String value) {
        for (ElementType state : ElementType.values()) {
            if (state.type.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}

