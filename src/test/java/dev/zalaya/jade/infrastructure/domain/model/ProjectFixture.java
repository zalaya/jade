package dev.zalaya.jade.infrastructure.domain.model;

import dev.zalaya.jade.domain.model.Project;

public class ProjectFixture {

    private ProjectFixture() {

    }

    public static Project aProjectWithDefaultNameAndPath() {
        return Project.builder()
            .name("Project")
            .path("/project")
            .build();
    }

}
