package dev.zalaya.kora.infrastructure.rest.response;

public class CreateDocumentResponse {

    private final Long id;
    private final String name;

    public CreateDocumentResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
