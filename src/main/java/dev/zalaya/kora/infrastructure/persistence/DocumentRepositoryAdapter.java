package dev.zalaya.kora.infrastructure.persistence;

import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.domain.port.outbound.persistence.DocumentRepository;
import dev.zalaya.kora.infrastructure.persistence.entity.*;
import dev.zalaya.kora.infrastructure.persistence.repository.DocumentJpaRepository;

import org.springframework.stereotype.Repository;

@Repository
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
