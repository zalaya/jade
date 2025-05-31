package dev.zalaya.kora.infrastructure.persistence.repository;

import dev.zalaya.kora.infrastructure.persistence.entity.ProjectEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectJpaRepository extends JpaRepository<ProjectEntity, Long> {

}
