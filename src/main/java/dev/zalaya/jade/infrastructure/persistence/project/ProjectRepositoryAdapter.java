package dev.zalaya.jade.infrastructure.persistence.project;

import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.domain.port.outbound.ProjectRepository;

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
