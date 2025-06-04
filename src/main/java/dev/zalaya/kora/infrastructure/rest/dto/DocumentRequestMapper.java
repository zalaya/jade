package dev.zalaya.kora.infrastructure.rest.dto;

import dev.zalaya.kora.domain.model.*;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DocumentRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "project", source = "project")
    Document toDomain(DocumentRequest request, @Context Project project);

}
