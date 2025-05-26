package dev.zalaya.jade.infrastructure.persistence.document;

import dev.zalaya.jade.infrastructure.persistence.project.ProjectEntity;

public class DocumentEntityFixtures {

    private DocumentEntityFixtures() {

    }

    public static DocumentEntity aDocumentEntityWithDefaultNameAndPathWithProjectEntity(ProjectEntity project) {
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
