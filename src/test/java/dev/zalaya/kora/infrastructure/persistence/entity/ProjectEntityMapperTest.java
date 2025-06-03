package dev.zalaya.kora.infrastructure.persistence.entity;

import dev.zalaya.kora.configuration.annotation.EntityMapperTestConfiguration;
import dev.zalaya.kora.domain.model.Project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.kora.configuration.fixture.domain.model.ProjectFixture.aProjectWithDefaultIdAndName;
import static dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity.ProjectEntityFixture.aProjectEntityWithDefaultIdAndName;

import static org.assertj.core.api.Assertions.assertThat;

@EntityMapperTestConfiguration
class ProjectEntityMapperTest {

    @Autowired
    private ProjectEntityMapper mapper;

    @Test
    void givenProject_whenToEntity_thenReturnProjectEntity() {
        // Given
        Project domain = aProjectWithDefaultIdAndName();

        // When
        ProjectEntity entity = mapper.toEntity(domain);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Project");
    }

    @Test
    void givenProjectEntity_whenToDomain_thenReturnProject() {
        // Given
        ProjectEntity entity = aProjectEntityWithDefaultIdAndName();

        // When
        Project domain = mapper.toDomain(entity);

        // Then
        assertThat(domain.getId()).isEqualTo(1L);
        assertThat(domain.getName()).isEqualTo("Project Entity");
    }

}
