package dev.zalaya.jade.persistence.entity;

import java.util.Objects;

public class DocumentEntity extends AuditableEntity {

    Long id;
    String name;
    String path;
    ProjectEntity project;

    protected DocumentEntity() {

    }

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

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DocumentEntity that)) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public static class Builder extends AuditableEntity.Builder<Builder> {

        private Long id;
        private String name;
        private String path;
        private ProjectEntity project;

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

        public DocumentEntity build() {
            return new DocumentEntity(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

}
