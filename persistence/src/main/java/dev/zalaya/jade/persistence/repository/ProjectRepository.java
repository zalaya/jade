package dev.zalaya.jade.persistence.repository;

import dev.zalaya.jade.persistence.entity.ProjectEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}
