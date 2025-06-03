package dev.zalaya.kora.infrastructure.persistence.entity;

import dev.zalaya.kora.domain.model.Document;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = ProjectEntityMapper.class)
public interface DocumentEntityMapper {

    Document toDomain(DocumentEntity entity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    DocumentEntity toEntity(Document domain);

}
