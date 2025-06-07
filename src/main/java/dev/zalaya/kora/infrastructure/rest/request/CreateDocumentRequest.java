package dev.zalaya.kora.infrastructure.rest.request;

public class CreateDocumentRequest {

    private String name;

    public CreateDocumentRequest(String name) {
        this.name = name;
    }

    public CreateDocumentRequest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
