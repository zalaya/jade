package dev.zalaya.kora.domain.port.inbound;

import dev.zalaya.kora.domain.model.Document;

public interface SaveDocumentUseCase {

    Document save(Document document);

}
