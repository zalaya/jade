package dev.zalaya.jade.infrastructure.persistence.mapper;

import dev.zalaya.jade.domain.model.Project;
import dev.zalaya.jade.infrastructure.persistence.entity.ProjectEntity;

import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectEntityMapper {

    Project toDomain(ProjectEntity entity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ProjectEntity toEntity(Project domain);

}
