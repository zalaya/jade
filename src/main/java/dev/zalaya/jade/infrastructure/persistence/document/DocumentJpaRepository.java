package dev.zalaya.jade.infrastructure.persistence.document;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentJpaRepository extends JpaRepository<DocumentEntity, Long> {

}
