package com.tcloud.utility;

import com.tcloud.dto.DocumentEntityChangeLog;
import com.tcloud.entity.Document;
import lombok.NonNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DocumentUtility {
    private DocumentUtility() {
        throw new IllegalStateException("This class can't be initialized");
    }

    public static DocumentEntityChangeLog getEntityDiff(@NonNull final Document d1,
                                                        @NonNull final Document d2) {
        return compareMaps(d1.getDocumentBody().getEntities(), d2.getDocumentBody().getEntities());
    }

    public static DocumentEntityChangeLog compareMaps(@NonNull final Map<String, byte[]> map1,
                                                      @NonNull final Map<String, byte[]> map2) {
        final Map<String, byte[]> added = new HashMap<>();
        final Map<String, byte[]> removed = new HashMap<>();
        final Map<String, byte[]> modified = new HashMap<>();

        for (Map.Entry<String, byte[]> entry : map1.entrySet()) {
            String key = entry.getKey();
            byte[] value1 = entry.getValue();

            if (map2.containsKey(key)) {
                byte[] value2 = map2.get(key);
                if (!Arrays.equals(value1, value2)) {
                    modified.put(key, value2);
                }
            } else {
                removed.put(key, value1);
            }
        }

        for (Map.Entry<String, byte[]> entry : map2.entrySet()) {
            String key = entry.getKey();
            byte[] value2 = entry.getValue();

            if (!map1.containsKey(key)) {
                added.put(key, value2);
            }
        }

        return DocumentEntityChangeLog.builder()
                .added(added)
                .removed(removed)
                .modified(modified)
                .build();
    }
}
