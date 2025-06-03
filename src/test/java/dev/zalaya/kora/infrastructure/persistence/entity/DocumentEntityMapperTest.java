package dev.zalaya.kora.infrastructure.persistence.entity;

import dev.zalaya.kora.configuration.annotation.EntityMapperTestConfiguration;
import dev.zalaya.kora.domain.model.Document;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.kora.configuration.fixture.domain.model.DocumentFixture.aDocumentWithDefaultIdNamePathAndProject;
import static dev.zalaya.kora.configuration.fixture.domain.model.ProjectFixture.aProjectWithDefaultIdAndName;
import static dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity.DocumentEntityFixture.aDocumentEntityWithDefaultIdNamePathAndProjectEntity;
import static dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity.ProjectEntityFixture.aProjectEntityWithDefaultIdAndName;

import static org.assertj.core.api.Assertions.assertThat;

@EntityMapperTestConfiguration
class DocumentEntityMapperTest {

    @Autowired
    private DocumentEntityMapper mapper;

    @Test
    void givenDocument_whenToEntity_thenReturnDocumentEntity() {
        // Given
        Document domain = aDocumentWithDefaultIdNamePathAndProject();

        // When
        DocumentEntity entity = mapper.toEntity(domain);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Document");
        assertThat(entity.getPath()).isEqualTo("/document");
        assertThat(entity.getProject()).isEqualTo(aProjectEntityWithDefaultIdAndName());
        assertThat(entity.getCreatedAt()).isNull();
        assertThat(entity.getUpdatedAt()).isNull();
    }

    @Test
    void givenDocumentEntity_whenToDomain_thenReturnDocument() {
        // Given
        DocumentEntity entity = aDocumentEntityWithDefaultIdNamePathAndProjectEntity();

        // When
        Document domain = mapper.toDomain(entity);

        // Then
        assertThat(domain.getId()).isEqualTo(1L);
        assertThat(domain.getName()).isEqualTo("Document Entity");
        assertThat(domain.getPath()).isEqualTo("/document-entity");
        assertThat(domain.getProject()).isEqualTo(aProjectWithDefaultIdAndName());
    }

}
