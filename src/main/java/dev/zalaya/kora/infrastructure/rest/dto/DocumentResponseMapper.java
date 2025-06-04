package dev.zalaya.kora.infrastructure.rest.dto;

import dev.zalaya.kora.domain.model.Document;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DocumentResponseMapper {

    @Mapping(source = "project.id", target = "projectId")
    DocumentResponse toResponse(Document document);

}
