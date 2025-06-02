package dev.zalaya.kora.domain.model;

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
