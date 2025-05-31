package dev.zalaya.kora.infrastructure.persistence.repository;

import dev.zalaya.kora.infrastructure.persistence.entity.DocumentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentJpaRepository extends JpaRepository<DocumentEntity, Long> {

}
