package dev.zalaya.jade.domain.model;

import dev.zalaya.jade.domain.vo.ProjectReference;

import java.util.Objects;

public final class Document {

    private final Long id;
    private final String name;
    private final String path;
    private final ProjectReference project;

    public Document(Long id, String name, String path, ProjectReference project) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.project = project;
    }

    private Document(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.path = builder.path;
        this.project = builder.project;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public ProjectReference getProject() {
        return project;
    }

    public static Builder builder() {
        return new Builder();
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

    public static class Builder {

        private Long id;
        private String name;
        private String path;
        private ProjectReference project;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder project(ProjectReference project) {
            this.project = project;
            return this;
        }

        public Document build() {
            return new Document(this);
        }

    }

}
