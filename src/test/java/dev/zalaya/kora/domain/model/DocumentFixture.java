package dev.zalaya.kora.domain.model;

import static dev.zalaya.kora.domain.model.ProjectFixture.aProjectWithIdAndName;

public class DocumentFixture {

    private DocumentFixture() {

    }

    public static Document aDocumentWithIdNamePathAndProject() {
        return Document.builder()
            .id(1L)
            .name("Document")
            .path("/document")
            .project(aProjectWithIdAndName())
            .build();
    }

}
