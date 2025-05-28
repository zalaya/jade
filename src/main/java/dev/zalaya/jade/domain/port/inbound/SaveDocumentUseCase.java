package dev.zalaya.jade.domain.port.inbound;

import dev.zalaya.jade.domain.model.Document;

public interface SaveDocumentUseCase {

    Document save(Document document);

}
