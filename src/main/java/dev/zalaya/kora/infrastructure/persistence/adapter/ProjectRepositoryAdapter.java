package dev.zalaya.kora.infrastructure.persistence.adapter;

import dev.zalaya.kora.domain.model.Project;
import dev.zalaya.kora.domain.port.outbound.persistence.ProjectRepository;
import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;
import dev.zalaya.kora.infrastructure.persistence.mapper.ProjectEntityMapper;
import dev.zalaya.kora.infrastructure.persistence.repository.ProjectJpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepositoryAdapter implements ProjectRepository {

    private final ProjectJpaRepository repository;
    private final ProjectEntityMapper mapper;

    public ProjectRepositoryAdapter(ProjectJpaRepository repository, ProjectEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Project save(Project project) {
        ProjectEntity entity = mapper.toEntity(project);
        ProjectEntity persistedEntity = repository.save(entity);

        return mapper.toDomain(persistedEntity);
    }

}
