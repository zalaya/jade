package dev.zalaya.kora.infrastructure.rest.dto;

public final class DocumentResponse {

    private final Long id;
    private final String name;
    private final Long projectId;

    public DocumentResponse(Long id, String name, Long projectId) {
        this.id = id;
        this.name = name;
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getProjectId() {
        return projectId;
    }

}
