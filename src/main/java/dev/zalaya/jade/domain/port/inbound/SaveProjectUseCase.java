package dev.zalaya.jade.domain.port.inbound;

import dev.zalaya.jade.domain.model.Project;

public interface SaveProjectUseCase {

    Project save(Project project);

}
