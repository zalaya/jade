package dev.zalaya.jade.persistence.repository;

import dev.zalaya.jade.persistence.entity.DocumentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {

}
