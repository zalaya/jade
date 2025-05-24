package dev.zalaya.jade.infrastructure.persistence.adapter;

import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.domain.port.outbound.ProjectRepository;
import dev.zalaya.jade.infrastructure.persistence.entity.ProjectEntity;
import dev.zalaya.jade.infrastructure.persistence.mapper.ProjectEntityMapper;
import dev.zalaya.jade.infrastructure.persistence.repository.ProjectJpaRepository;

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
