package dev.zalaya.jade.infrastructure.persistence.document;

import dev.zalaya.jade.domain.model.Document;
import dev.zalaya.jade.domain.port.outbound.DocumentRepository;

public class DocumentRepositoryAdapter implements DocumentRepository {

    private final DocumentJpaRepository repository;
    private final DocumentEntityMapper mapper;

    public DocumentRepositoryAdapter(DocumentJpaRepository repository, DocumentEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Document save(Document document) {
        DocumentEntity entity = mapper.toEntity(document);
        DocumentEntity persistedEntity = repository.save(entity);

        return mapper.toDomain(persistedEntity);
    }

}
