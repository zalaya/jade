package dev.zalaya.jade.infrastructure.persistence.project;

public class ProjectEntityFixtures {

    private ProjectEntityFixtures() {

    }

    public static ProjectEntity aProjectEntityWithDefaultNameAndPath() {
        return ProjectEntity.builder()
            .name("Project")
            .path("/project")
            .build();
    }

    public static ProjectEntity aProjectEntityWithDefaultPathWithName(String name) {
        return ProjectEntity.builder()
            .name(name)
            .path("/project")
            .build();
    }

    public static ProjectEntity aProjectEntityWithDefaultNameWithPath(String path) {
        return ProjectEntity.builder()
            .name("Project")
            .path(path)
            .build();
    }

    public static  ProjectEntity aProjectEntityWithDefaultIdNameAndPath() {
        return ProjectEntity.builder()
            .id(999L)
            .name("Project")
            .path("/project")
            .build();
    }

}
