package dev.zalaya.jade.infrastructure.persistence.document;

import dev.zalaya.jade.domain.model.*;
import dev.zalaya.jade.infrastructure.persistence.annotation.MapperTestConfiguration;

import dev.zalaya.jade.infrastructure.persistence.project.ProjectEntity;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.jade.infrastructure.domain.model.DocumentFixtures.aDocumentWithDefaultNameAndPathWithProject;
import static dev.zalaya.jade.infrastructure.domain.model.ProjectFixtures.aProjectWithDefaultNameAndPath;
import static dev.zalaya.jade.infrastructure.persistence.document.DocumentEntityFixtures.aDocumentEntityWithDefaultNameAndPathWithProjectEntity;
import static dev.zalaya.jade.infrastructure.persistence.project.ProjectEntityFixtures.aProjectEntityWithDefaultNameAndPath;

import static org.assertj.core.api.Assertions.assertThat;

@MapperTestConfiguration
class DocumentEntityMapperTest {

    @Autowired
    private DocumentEntityMapper mapper;

    @Test
    void givenDocument_whenToEntity_thenReturnMappedDocumentEntity() {
        // Given
        Project project = aProjectWithDefaultNameAndPath();
        Document document = aDocumentWithDefaultNameAndPathWithProject(project);

        // When
        DocumentEntity documentEntity = mapper.toEntity(document);

        // Then
        assertThat(documentEntity.getId()).isEqualTo(document.getId());
        assertThat(documentEntity.getName()).isEqualTo(document.getName());
        assertThat(documentEntity.getPath()).isEqualTo(document.getPath());
        assertThat(documentEntity.getProject()).isEqualTo(aProjectEntityWithDefaultNameAndPath());
    }

    @Test
    void givenDocumentEntity_whenToDomain_thenReturnMappedDocument() {
        // Given
        ProjectEntity projectEntity = aProjectEntityWithDefaultNameAndPath();
        DocumentEntity documentEntity = aDocumentEntityWithDefaultNameAndPathWithProjectEntity(projectEntity);

        // When
        Document document = mapper.toDomain(documentEntity);

        // Then
        assertThat(document.getId()).isEqualTo(documentEntity.getId());
        assertThat(document.getName()).isEqualTo(documentEntity.getName());
        assertThat(document.getPath()).isEqualTo(documentEntity.getPath());
        assertThat(document.getProject()).isEqualTo(aProjectWithDefaultNameAndPath());
    }

}
