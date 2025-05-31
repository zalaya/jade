package dev.zalaya.kora.domain.model;

import static dev.zalaya.kora.domain.vo.DocumentReferenceFixture.*;

public class ProjectFixture {

    private ProjectFixture() {

    }

    public static Project aProjectWithDefaultIdNameAndNoDocumentReferences() {
        return Project.builder()
            .id(1L)
            .name("Project")
            .documents(anEmptySetOfDocumentReferences())
            .build();
    }

    public static Project aProjectWithDefaultIdNameAndOnlyOneDocumentReference() {
        return Project.builder()
            .id(1L)
            .name("Project")
            .documents(aSetOfOnlyOneDefaultDocumentReference())
            .build();
    }

}
