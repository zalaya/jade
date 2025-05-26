package dev.zalaya.jade.infrastructure.persistence.project;

import dev.zalaya.jade.infrastructure.persistence.shared.AuditableEntity;

import java.util.Objects;

public class ProjectEntity extends AuditableEntity {

    private Long id;
    private String name;
    private String path;

    protected ProjectEntity() {

    }

    private ProjectEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.path = builder.path;
        setCreatedAt(builder.getCreatedAt());
        setUpdatedAt(builder.getUpdatedAt());
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

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProjectEntity that)) {
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

        public ProjectEntity build() {
            return new ProjectEntity(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

}
