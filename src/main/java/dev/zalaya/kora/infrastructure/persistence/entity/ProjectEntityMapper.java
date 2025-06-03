package dev.zalaya.kora.infrastructure.persistence.entity;

import dev.zalaya.kora.domain.model.Project;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectEntityMapper {

    Project toDomain(ProjectEntity entity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ProjectEntity toEntity(Project domain);
}
