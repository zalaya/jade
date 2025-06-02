package dev.zalaya.kora.infrastructure.entity;

import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;

public class ProjectEntityFixture {

    private ProjectEntityFixture() {

    }

    public static ProjectEntity aProjectEntityWithIdAndName() {
        return ProjectEntity.builder()
            .id(1L)
            .name("Project Entity")
            .build();
    }

}
