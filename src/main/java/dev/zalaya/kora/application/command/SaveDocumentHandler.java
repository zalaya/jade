package dev.zalaya.kora.application.command;

import dev.zalaya.kora.infrastructure.rest.dto.DocumentResponse;

import org.springframework.stereotype.Component;

@Component
public class SaveDocumentHandler implements CommandHandler<SaveDocumentCommand, DocumentResponse> {

    private final DocumentSaveFacade facade;

    public SaveDocumentHandler(DocumentSaveFacade facade) {
        this.facade = facade;
    }

    @Override
    public DocumentResponse handle(SaveDocumentCommand command) {
        return facade.save(command.getName(), command.getProjectId());
    }
}
