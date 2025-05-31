package dev.zalaya.kora.infrastructure.persistence.entity;

import java.util.HashSet;
import java.util.Set;

public class DocumentEntityFixture {

    private DocumentEntityFixture() {

    }

    public static Set<DocumentEntity> anEmptySetOfDocumentEntities() {
        return new HashSet<>(0);
    }

    public static DocumentEntity aDocumentEntityWithOnlyDefaultId() {
        return DocumentEntity.builder()
            .id(1L)
            .build();
    }

    public static Set<DocumentEntity> aSetOfOnlyOneDefaultDocumentEntity() {
        return Set.of(
            aDocumentEntityWithOnlyDefaultId()
        );
    }

}
