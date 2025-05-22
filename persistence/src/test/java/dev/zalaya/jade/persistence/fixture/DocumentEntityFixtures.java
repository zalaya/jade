package dev.zalaya.jade.persistence.fixture;

import dev.zalaya.jade.persistence.entity.*;

public class DocumentEntityFixtures {

    private DocumentEntityFixtures() {

    }

    public static DocumentEntity aDocumentEntityWithDefaultNameAndPathWithProject(ProjectEntity project) {
        return DocumentEntity.builder()
            .name("Document")
            .path("/document")
            .project(project)
            .build();
    }

    public static DocumentEntity aDocumentEntityWithDefaultPathWithProjectAndName(ProjectEntity project, String name) {
        return DocumentEntity.builder()
            .name(name)
            .path("/document")
            .project(project)
            .build();
    }

    public static DocumentEntity aDocumentEntityWithDefaultNameWithProjectAndPath(ProjectEntity project, String path) {
        return DocumentEntity.builder()
            .name("Document")
            .path(path)
            .project(project)
            .build();
    }

}
