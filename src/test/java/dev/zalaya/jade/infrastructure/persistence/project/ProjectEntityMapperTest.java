package dev.zalaya.jade.infrastructure.persistence.project;

import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.infrastructure.persistence.project.ProjectEntityMapperImpl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static dev.zalaya.jade.infrastructure.domain.model.ProjectFixtures.aProjectWithDefaultNameAndPath;
import static dev.zalaya.jade.infrastructure.persistence.project.ProjectEntityFixtures.aProjectEntityWithDefaultNameAndPath;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@Import(ProjectEntityMapperImpl.class)
class ProjectEntityMapperTest {

    @Autowired
    private ProjectEntityMapper mapper;

    @Test
    void givenProject_whenToEntity_thenReturnMappedProjectEntity() {
        // Given
        Project project = aProjectWithDefaultNameAndPath();

        // When
        ProjectEntity projectEntity = mapper.toEntity(project);

        // Then
        assertThat(projectEntity.getId()).isEqualTo(project.getId());
        assertThat(projectEntity.getName()).isEqualTo(project.getName());
        assertThat(projectEntity.getPath()).isEqualTo(project.getPath());
    }

    @Test
    void givenProjectEntity_whenToDomain_thenReturnMappedProject() {
        // Given
        ProjectEntity projectEntity = aProjectEntityWithDefaultNameAndPath();

        // When
        Project project = mapper.toDomain(projectEntity);

        // Then
        assertThat(project.getId()).isEqualTo(projectEntity.getId());
        assertThat(project.getName()).isEqualTo(projectEntity.getName());
        assertThat(project.getPath()).isEqualTo(projectEntity.getPath());
    }

}
