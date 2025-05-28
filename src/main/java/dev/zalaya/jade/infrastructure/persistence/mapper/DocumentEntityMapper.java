package dev.zalaya.jade.infrastructure.persistence.mapper;

import dev.zalaya.jade.domain.model.Document;
import dev.zalaya.jade.infrastructure.persistence.entity.DocumentEntity;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = ProjectEntityMapper.class)
public interface DocumentEntityMapper {

    @Mapping(source = "project", target = "project")
    Document toDomain(DocumentEntity entity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(source = "project", target = "project")
    DocumentEntity toEntity(Document domain);

}
