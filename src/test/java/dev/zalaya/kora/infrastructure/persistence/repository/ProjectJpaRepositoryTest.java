package dev.zalaya.kora.infrastructure.persistence.repository;

import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;

import static dev.zalaya.kora.configuration.fixture.infrastructure.persistence.entity.ProjectEntityFixture.*;

import static org.assertj.core.api.AssertionsForClassTypes.*;

@DataJpaTest
class ProjectJpaRepositoryTest {

    @Autowired
    private ProjectJpaRepository repository;

    @Autowired
    private EntityManager manager;

    @Test
    void givenCompleteProjectEntity_whenSave_thenIdAndCreatedAtAreSet() {
        // Given
        ProjectEntity project = aProjectEntityWithDefaultName();

        // When
        ProjectEntity persistedProject = repository.saveAndFlush(project);

        // Then
        assertThat(persistedProject.getId()).isNotNull();
        assertThat(persistedProject.getCreatedAt()).isNotNull();
        assertThat(persistedProject.getUpdatedAt()).isNull();
    }

    @Test
    void givenProjectEntityWithoutName_whenSave_thenThrowsDataIntegrityViolationException() {
        // Given
        ProjectEntity project = aProjectEntity();

        // When
        Executable executable = () -> repository.saveAndFlush(project);

        // Then
        assertThatThrownBy(executable::execute).isInstanceOf(DataIntegrityViolationException.class);
    }

    @Test
    @Sql(statements = "INSERT INTO projects (id, name, created_at) VALUES (1, 'Project Entity', CURRENT_TIMESTAMP)")
    void givenPersistedProjectEntity_whenSave_thenFieldsAreUpdated() {
        // Given
        ProjectEntity persistedProject = manager.getReference(ProjectEntity.class, 1L);
        persistedProject.setName("Updated Project Entity");

        // When
        ProjectEntity updatedProject = repository.saveAndFlush(persistedProject);

        // Then
        assertThat(updatedProject.getName()).isEqualTo("Updated Project Entity");
        assertThat(updatedProject.getCreatedAt()).isEqualTo(persistedProject.getCreatedAt());
        assertThat(updatedProject.getUpdatedAt()).isNotNull().isAfterOrEqualTo(persistedProject.getUpdatedAt());
    }

}
