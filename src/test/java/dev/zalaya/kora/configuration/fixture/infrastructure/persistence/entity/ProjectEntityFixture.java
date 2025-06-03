package dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity;

import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;

public class ProjectEntityFixture {

    private ProjectEntityFixture() {

    }

    public static ProjectEntity aProjectEntityWithDefaultIdAndName() {
        return ProjectEntity.builder()
            .id(1L)
            .name("Project Entity")
            .build();
    }

    public static ProjectEntity aProjectEntityWithDefaultName() {
        return ProjectEntity.builder()
            .name("Project Entity")
            .build();
    }

    public static ProjectEntity aProjectEntityWithDefaultIdWithName(String name) {
        return ProjectEntity.builder()
            .id(1L)
            .name(name)
            .build();
    }

    public static ProjectEntity aProjectEntity() {
        return ProjectEntity.builder()
            .build();
    }

}
