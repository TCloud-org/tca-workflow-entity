package com.tcloud.Translator;

import com.tcloud.entity.Descendant;
import lombok.NonNull;

import java.util.stream.Collectors;

public final class HTMLTranslator {
    private HTMLTranslator() {
        throw new IllegalStateException("Class can not be initialized");
    }

    public static String from(@NonNull final Descendant descendant) {
        final String textContentTag = descendant.getTextContentTag();
        final String textSemanticTag = descendant.getTextSemanticTag();
        final String text = descendant.getText();

        final String childrenContent = descendant.getChildren().stream()
                .map(HTMLTranslator::from)
                .collect(Collectors.joining("\n"));

        final String children = text + "\n" + childrenContent;

        return wrapWithTags(textContentTag, wrapWithTags(textSemanticTag, children));
    }

    private static String wrapWithTags(String tags,
                                       String children) {
        return "<" + tags + ">" + children + "</" + tags + ">";
    }
}
