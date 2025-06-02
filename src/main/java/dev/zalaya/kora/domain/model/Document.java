package dev.zalaya.kora.domain.model;

import java.util.Objects;

public final class Document {

    private final Long id;
    private final String name;
    private final String path;

    public Document(Long id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    private Document(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.path = builder.path;
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

        public Document build() {
            return new Document(this);
        }

    }

}
