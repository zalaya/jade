package dev.zalaya.kora.application.service;

import dev.zalaya.kora.domain.model.Project;
import dev.zalaya.kora.domain.port.inbound.SaveProjectUseCase;
import dev.zalaya.kora.domain.port.outbound.persistence.ProjectRepository;

import org.springframework.stereotype.Service;

@Service
public class ProjectService implements SaveProjectUseCase {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Project save(Project project) {
        return repository.save(project);
    }

}
