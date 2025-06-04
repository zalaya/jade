package dev.zalaya.kora.domain.port.inbound;

import dev.zalaya.kora.domain.model.Project;

public interface FindProjectByIdUseCase {

    Project findById(Long id);

}
