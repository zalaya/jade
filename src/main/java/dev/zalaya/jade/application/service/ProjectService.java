package dev.zalaya.jade.application.service;

import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.domain.port.inbound.SaveProjectUseCase;
import dev.zalaya.jade.domain.port.outbound.persistence.ProjectRepository;

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
