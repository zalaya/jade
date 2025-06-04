package dev.zalaya.kora.application.service;

import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.domain.port.inbound.SaveDocumentUseCase;
import dev.zalaya.kora.domain.port.outbound.persistence.DocumentRepository;

import org.springframework.stereotype.Service;

@Service
public class DocumentService implements SaveDocumentUseCase {

    private final DocumentRepository repository;

    public DocumentService(DocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Document save(Document document) {
        return repository.save(document);
    }

}
