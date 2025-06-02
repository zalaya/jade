package dev.zalaya.kora.infrastructure.mapper;

import dev.zalaya.kora.annotation.EntityMapperTestConfiguration;
import dev.zalaya.kora.domain.model.Project;
import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;
import dev.zalaya.kora.infrastructure.persistence.mapper.ProjectEntityMapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.kora.domain.model.ProjectFixture.aProjectWithIdAndName;
import static dev.zalaya.kora.infrastructure.entity.ProjectEntityFixture.aProjectEntityWithIdAndName;

import static org.assertj.core.api.Assertions.assertThat;

@EntityMapperTestConfiguration
class ProjectEntityMapperTest {

    @Autowired
    private ProjectEntityMapper mapper = Mappers.getMapper(ProjectEntityMapper.class);

    @Test
    void givenProject_toEntity_returnProjectEntity() {
        // Given
        Project domain = aProjectWithIdAndName();

        // When
        ProjectEntity entity = mapper.toEntity(domain);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Project");
    }

    @Test
    void givenProjectEntity_toDomain_returnProject() {
        // Given
        ProjectEntity entity = aProjectEntityWithIdAndName();

        // When
        Project domain = mapper.toDomain(entity);

        // Then
        assertThat(domain.getId()).isEqualTo(1L);
        assertThat(domain.getName()).isEqualTo("Project Entity");
    }

}
