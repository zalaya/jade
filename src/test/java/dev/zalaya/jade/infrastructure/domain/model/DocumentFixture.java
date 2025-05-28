package dev.zalaya.jade.infrastructure.domain.model;

import dev.zalaya.jade.domain.model.*;
import dev.zalaya.jade.domain.vo.ProjectReference;

public class DocumentFixture {

    private DocumentFixture() {

    }

    public static Document aDocumentWithDefaultNameAndPathWithProject(ProjectReference project) {
        return Document.builder()
            .name("Document")
            .path("/document")
            .project(project)
            .build();
    }

}
