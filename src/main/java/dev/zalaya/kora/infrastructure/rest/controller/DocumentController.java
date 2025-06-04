package dev.zalaya.kora.infrastructure.rest.controller;

import dev.zalaya.kora.application.command.*;

import dev.zalaya.kora.infrastructure.rest.dto.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentController {

    private final Mediator mediator;

    public DocumentController(Mediator mediator) {
        this.mediator = mediator;
    }

    @PostMapping
    public ResponseEntity<DocumentResponse> save(@RequestBody DocumentRequest request) {
        SaveDocumentCommand command = new SaveDocumentCommand(request.getName(), request.getProjectId());
        return ResponseEntity.ok(mediator.dispatch(command));
    }

}
