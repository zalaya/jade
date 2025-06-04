package dev.zalaya.kora.application.command;

import dev.zalaya.kora.domain.model.*;
import dev.zalaya.kora.domain.port.inbound.*;
import dev.zalaya.kora.infrastructure.rest.dto.*;

import org.springframework.stereotype.Component;

@Component
public class DocumentSaveFacade {

    private final SaveDocumentUseCase saveUseCase;
    private final FindProjectByIdUseCase findProjectByIdUseCase;
    private final DocumentRequestMapper requestMapper;
    private final DocumentResponseMapper responseMapper;

    public DocumentSaveFacade(SaveDocumentUseCase saveUseCase, FindProjectByIdUseCase findProjectByIdUseCase, DocumentRequestMapper requestMapper, DocumentResponseMapper responseMapper) {
        this.saveUseCase = saveUseCase;
        this.findProjectByIdUseCase = findProjectByIdUseCase;
        this.requestMapper = requestMapper;
        this.responseMapper = responseMapper;
    }

    public DocumentResponse save(String name, Long projectId) {
        Project project = findProjectByIdUseCase.findById(projectId);
        DocumentRequest request = new DocumentRequest(name, projectId);
        Document document = requestMapper.toDomain(request, project);

        return responseMapper.toResponse(saveUseCase.save(document));
    }
}