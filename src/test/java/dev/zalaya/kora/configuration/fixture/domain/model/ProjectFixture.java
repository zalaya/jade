package dev.zalaya.kora.configuration.fixture.domain.model;

import dev.zalaya.kora.domain.model.Project;

public class ProjectFixture {

    private ProjectFixture() {

    }

    public static Project aProjectWithIdAndName() {
        return Project.builder()
            .id(1L)
            .name("Project")
            .build();
    }

}
