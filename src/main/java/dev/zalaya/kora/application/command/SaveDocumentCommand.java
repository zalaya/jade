package dev.zalaya.kora.application.command;

public final class SaveDocumentCommand {

    private final String name;
    private final Long projectId;

    public SaveDocumentCommand(String name, Long projectId) {
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
