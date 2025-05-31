package dev.zalaya.kora.domain.model;

import dev.zalaya.kora.domain.vo.DocumentReference;

import java.util.*;

public final class Project {

    private final Long id;
    private final String name;
    private final Set<DocumentReference> documents;

    public Project(Long id, String name, Set<DocumentReference> documents) {
        this.id = id;
        this.name = name;
        this.documents = documents;
    }

    private Project(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.documents = builder.documents;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<DocumentReference> getDocuments() {
        return documents;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Project that)) {
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
        private Set<DocumentReference> documents;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder documents(Set<DocumentReference> documents) {
            this.documents = documents;
            return this;
        }

        public Project build() {
            return new Project(this);
        }

    }

}
