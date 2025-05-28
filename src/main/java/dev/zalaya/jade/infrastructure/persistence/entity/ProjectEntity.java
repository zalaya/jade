package dev.zalaya.jade.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "projects")
public class ProjectEntity extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DocumentEntity> documents = new HashSet<>();

    protected ProjectEntity() {

    }

    private ProjectEntity(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.documents = builder.documents;
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

    public Set<DocumentEntity> getDocuments() {
        return documents;
    }

    public void setPath(Set<DocumentEntity> documents) {
        this.documents = documents;
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
        private Set<DocumentEntity> documents;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder documents(Set<DocumentEntity> documents) {
            this.documents = documents;
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
