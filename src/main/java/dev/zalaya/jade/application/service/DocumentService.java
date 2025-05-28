package dev.zalaya.jade.application.service;

import dev.zalaya.jade.domain.model.Document;
import dev.zalaya.jade.domain.port.inbound.SaveDocumentUseCase;
import dev.zalaya.jade.domain.port.outbound.persistence.DocumentRepository;

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
