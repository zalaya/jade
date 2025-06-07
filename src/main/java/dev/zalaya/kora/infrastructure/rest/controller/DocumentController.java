package dev.zalaya.kora.infrastructure.rest.controller;

import dev.zalaya.kora.application.command.*;
import dev.zalaya.kora.domain.model.Document;
import dev.zalaya.kora.infrastructure.rest.request.CreateDocumentRequest;
import dev.zalaya.kora.infrastructure.rest.response.CreateDocumentResponse;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/document")
public class DocumentController {

    private final CommandDispatcher dispatcher;

    public DocumentController(CommandDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @PostMapping
    public ResponseEntity<CreateDocumentResponse> create(@RequestBody CreateDocumentRequest request) {
        CreateDocument command = new CreateDocument(request.getName());
        Document document = dispatcher.dispatch(command);
        CreateDocumentResponse response = new CreateDocumentResponse(document.getId(), document.getName());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
