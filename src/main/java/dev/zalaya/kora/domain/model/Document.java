package dev.zalaya.kora.domain.model;

import java.util.Objects;

public final class Document {

    private final Long id;
    private final String name;
    private final Project project;

    public Document(Long id, String name, Project project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        return project;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Document that)) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
