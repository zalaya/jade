package dev.zalaya.kora.infrastructure.mapper;

import dev.zalaya.kora.annotation.EntityMapperTestConfiguration;
import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.infrastructure.persistence.entity.DocumentEntity;
import dev.zalaya.kora.infrastructure.persistence.mapper.DocumentEntityMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static dev.zalaya.kora.domain.model.DocumentFixture.aDocumentWithIdNamePathAndProject;
import static dev.zalaya.kora.domain.model.ProjectFixture.aProjectWithIdAndName;
import static dev.zalaya.kora.infrastructure.entity.DocumentEntityFixture.aDocumentEntityWithIdNamePathAndProjectEntity;
import static dev.zalaya.kora.infrastructure.entity.ProjectEntityFixture.aProjectEntityWithIdAndName;

import static org.assertj.core.api.Assertions.assertThat;

@EntityMapperTestConfiguration
class DocumentEntityMapperTest {

    @Autowired
    private DocumentEntityMapper mapper;

    @Test
    void givenDocument_toEntity_returnDocumentEntity() {
        // Given
        Document domain = aDocumentWithIdNamePathAndProject();

        // When
        DocumentEntity entity = mapper.toEntity(domain);

        // Then
        assertThat(entity.getId()).isEqualTo(1L);
        assertThat(entity.getName()).isEqualTo("Document");
        assertThat(entity.getPath()).isEqualTo("/document");
        assertThat(entity.getProject()).isEqualTo(aProjectEntityWithIdAndName());
        assertThat(entity.getCreatedAt()).isNull();
        assertThat(entity.getUpdatedAt()).isNull();
    }

    @Test
    void givenDocumentEntity_toDomain_returnDocument() {
        // Given
        DocumentEntity entity = aDocumentEntityWithIdNamePathAndProjectEntity();

        // When
        Document domain = mapper.toDomain(entity);

        // Then
        assertThat(domain.getId()).isEqualTo(1L);
        assertThat(domain.getName()).isEqualTo("Document Entity");
        assertThat(domain.getPath()).isEqualTo("/document-entity");
        assertThat(domain.getProject()).isEqualTo(aProjectWithIdAndName());
    }

}
