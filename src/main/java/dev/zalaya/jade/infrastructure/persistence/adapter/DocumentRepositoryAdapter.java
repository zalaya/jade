package dev.zalaya.jade.infrastructure.persistence.adapter;

import dev.zalaya.jade.domain.model.Document;
import dev.zalaya.jade.domain.port.outbound.DocumentRepository;
import dev.zalaya.jade.infrastructure.persistence.entity.DocumentEntity;
import dev.zalaya.jade.infrastructure.persistence.mapper.DocumentEntityMapper;
import dev.zalaya.jade.infrastructure.persistence.repository.DocumentJpaRepository;

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
