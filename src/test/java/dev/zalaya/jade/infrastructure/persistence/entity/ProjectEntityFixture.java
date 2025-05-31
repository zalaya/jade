package dev.zalaya.jade.infrastructure.persistence.entity;

import static dev.zalaya.jade.infrastructure.persistence.entity.DocumentEntityFixture.*;

public class ProjectEntityFixture {

    private ProjectEntityFixture() {

    }

    public static ProjectEntity aProjectEntityWithDefaultIdNameAndNoDocumentEntities() {
        return ProjectEntity.builder()
            .id(1L)
            .name("Project")
            .documents(anEmptySetOfDocumentEntities())
            .build();
    }

    public static ProjectEntity aProjectEntityWithDefaultIdNameAndOnlyOneDocumentEntity() {
        return ProjectEntity.builder()
            .id(1L)
            .name("Project")
            .documents(aSetOfOnlyOneDefaultDocumentEntity())
            .build();
    }

}
