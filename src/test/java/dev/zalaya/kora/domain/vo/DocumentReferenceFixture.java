package dev.zalaya.kora.domain.vo;

import java.util.HashSet;
import java.util.Set;

public class DocumentReferenceFixture {

    private DocumentReferenceFixture() {

    }

    public static DocumentReference aDocumentReferenceWithDefaultId() {
        return DocumentReference.builder()
            .id(1L)
            .build();
    }

    public static Set<DocumentReference> anEmptySetOfDocumentReferences() {
        return new HashSet<>(0);
    }

    public static Set<DocumentReference> aSetOfOnlyOneDefaultDocumentReference() {
        return Set.of(
            aDocumentReferenceWithDefaultId()
        );
    }

}
