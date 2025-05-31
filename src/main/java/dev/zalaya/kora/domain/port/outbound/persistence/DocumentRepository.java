package dev.zalaya.kora.domain.port.outbound.persistence;

import dev.zalaya.kora.domain.model.Document;

public interface DocumentRepository {

    Document save(Document document);

}
