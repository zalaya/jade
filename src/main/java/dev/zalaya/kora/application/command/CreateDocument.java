package dev.zalaya.kora.application.command;

import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.domain.port.outbound.persistence.DocumentRepository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class CreateDocument implements Command<Document> {

    private final String name;

    public CreateDocument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Component
    public static class Handler implements CommandHandler<CreateDocument, Document> {

        private final DocumentRepository repository;
        private final CommandDispatcher dispatcher;

        public Handler(DocumentRepository repository, CommandDispatcher dispatcher) {
            this.repository = repository;
            this.dispatcher = dispatcher;
        }

        @PostConstruct
        public void init() {
            dispatcher.register(CreateDocument.class, this);
        }

        @Override
        public Document handle(CreateDocument command) {
            return repository.save(new Document(null, command.getName()));
        }
    }

}