package dev.zalaya.kora.domain.port.inbound;

import dev.zalaya.kora.domain.model.Project;

public interface SaveProjectUseCase {

    Project save(Project project);

}
