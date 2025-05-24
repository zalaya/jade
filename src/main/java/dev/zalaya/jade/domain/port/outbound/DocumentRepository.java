package dev.zalaya.jade.domain.port.outbound;

import dev.zalaya.jade.domain.model.Document;

public interface DocumentRepository {

    Document save(Document document);

}
