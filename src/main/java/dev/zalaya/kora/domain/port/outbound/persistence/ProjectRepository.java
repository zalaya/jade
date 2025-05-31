package dev.zalaya.kora.domain.port.outbound.persistence;

import dev.zalaya.kora.domain.model.Project;

public interface ProjectRepository {

    Project save(Project project);

}
