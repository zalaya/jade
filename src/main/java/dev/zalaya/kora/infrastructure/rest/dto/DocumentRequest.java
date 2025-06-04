package dev.zalaya.kora.infrastructure.rest.dto;

public final class DocumentRequest {

    private final String name;
    private final Long projectId;

    public DocumentRequest(String name, Long projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public Long getProjectId() {
        return projectId;
    }

}
