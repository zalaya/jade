package dev.zalaya.jade.infrastructure.persistence.mapper;

import dev.zalaya.jade.annotation.EntityMapperTestConfiguration;
import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.infrastructure.persistence.entity.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.jade.domain.model.ProjectFixture.*;
import static dev.zalaya.jade.domain.vo.DocumentReferenceFixture.aSetOfOnlyOneDefaultDocumentReference;
import static dev.zalaya.jade.infrastructure.persistence.entity.DocumentEntityFixture.aSetOfOnlyOneDefaultDocumentEntity;
import static dev.zalaya.jade.infrastructure.persistence.entity.ProjectEntityFixture.*;

import static org.assertj.core.api.Assertions.assertThat;

@EntityMapperTestConfiguration
class ProjectEntityMapperTest {

    @Autowired
    private ProjectEntityMapper mapper;

    @Test
    void givenProjectWithNoDocuments_whenToEntity_thenReturnValidProjectEntity() {
        // Given
        Project project = aProjectWithDefaultIdNameAndNoDocumentReferences();

        // When
        ProjectEntity entity = mapper.toEntity(project);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Project");
        assertThat(entity.getDocuments()).isEmpty();
    }

    @Test
    void givenProjectWithDocuments_whenToEntity_thenReturnValidProjectEntity() {
        // Given
        Project project = aProjectWithDefaultIdNameAndOnlyOneDocumentReference();

        // When
        ProjectEntity entity = mapper.toEntity(project);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Project");
        assertThat(entity.getDocuments()).isEqualTo(aSetOfOnlyOneDefaultDocumentEntity());
    }

    @Test
    void givenProjectEntityWithNoDocumentEntities_whenToDomain_thenReturnValidProject() {
        // Given
        ProjectEntity entity = aProjectEntityWithDefaultIdNameAndNoDocumentEntities();

        // When
        Project project = mapper.toDomain(entity);

        // Then
        assertThat(project.getId()).isEqualTo(1L);
        assertThat(project.getName()).isEqualTo("Project");
        assertThat(project.getDocuments()).isEmpty();
    }

    @Test
    void givenProjectEntityWithDocumentEntities_whenToDomain_thenReturnValidProject() {
        // Given
        ProjectEntity entity = aProjectEntityWithDefaultIdNameAndOnlyOneDocumentEntity();

        // When
        Project project = mapper.toDomain(entity);

        // Then
        assertThat(project.getId()).isEqualTo(1L);
        assertThat(project.getName()).isEqualTo("Project");
        assertThat(project.getDocuments()).isEqualTo(aSetOfOnlyOneDefaultDocumentReference());
    }


}
