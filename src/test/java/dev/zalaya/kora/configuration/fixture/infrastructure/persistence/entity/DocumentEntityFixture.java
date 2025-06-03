package dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity;

import dev.zalaya.kora.infrastructure.persistence.entity.DocumentEntity;

import static dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity.ProjectEntityFixture.aProjectEntityWithIdAndName;

public class DocumentEntityFixture {

    private DocumentEntityFixture() {

    }

    public static DocumentEntity aDocumentEntityWithIdNamePathAndProjectEntity() {
        return DocumentEntity.builder()
            .id(1L)
            .name("Document Entity")
            .path("/document-entity")
            .project(aProjectEntityWithIdAndName())
            .build();
    }

}
