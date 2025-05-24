package dev.zalaya.jade.infrastructure.persistence.repository;

import dev.zalaya.jade.infrastructure.persistence.entity.DocumentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentJpaRepository extends JpaRepository<DocumentEntity, Long> {

}
