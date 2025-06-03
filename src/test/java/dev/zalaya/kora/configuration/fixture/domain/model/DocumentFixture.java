package dev.zalaya.kora.configuration.fixture.domain.model;

import dev.zalaya.kora.domain.model.Document;

import static dev.zalaya.kora.configuration.fixture.domain.model.ProjectFixture.aProjectWithIdAndName;

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
