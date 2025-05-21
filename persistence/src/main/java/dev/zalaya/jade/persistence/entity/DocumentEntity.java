package dev.zalaya.jade.persistence.entity;

import java.time.Instant;

public class DocumentEntity extends AuditableEntity {

    Long id;
    String name;
    String path;
    ProjectEntity project;

    public DocumentEntity() {}

    private DocumentEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.path = builder.path;
        this.project = builder.project;
        setCreatedAt(builder.createdAt);
        setUpdatedAt(builder.updatedAt);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Long id;
        private String name;
        private String path;
        private ProjectEntity project;
        private Instant createdAt;
        private Instant updatedAt;

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

        public Builder project(ProjectEntity project) {
            this.project = project;
            return this;
        }

        public Builder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public DocumentEntity build() {
            return new DocumentEntity(this);
        }

    }

}
