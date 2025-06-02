package dev.zalaya.kora.infrastructure.persistence.mapper;

import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.infrastructure.persistence.entity.DocumentEntity;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DocumentEntityMapper {

    @Mapping(target = "project", ignore = true)
    Document toDomain(DocumentEntity entity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "project", ignore = true)
    DocumentEntity toEntity(Document domain);

}
