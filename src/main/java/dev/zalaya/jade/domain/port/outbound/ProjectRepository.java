package dev.zalaya.jade.domain.port.outbound;

import dev.zalaya.jade.domain.model.Project;

public interface ProjectRepository {

    Project save(Project project);

}
