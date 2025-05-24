package dev.zalaya.jade.infrastructure.domain.model;

import dev.zalaya.jade.domain.model.Document;
import dev.zalaya.jade.domain.model.Project;

public class DocumentFixtures {

    private DocumentFixtures() {

    }

    public static Document aDocumentWithDefaultNameAndPathWithProject(Project project) {
        return Document.builder()
            .name("Document")
            .path("/document")
            .project(project)
            .build();
    }

}
