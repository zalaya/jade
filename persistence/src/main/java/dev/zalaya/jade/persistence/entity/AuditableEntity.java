package dev.zalaya.jade.persistence.entity;

import java.time.Instant;

public abstract class AuditableEntity {

    private Instant createdAt;
    private Instant updatedAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    protected void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    protected void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void onPrePersist() {
        this.createdAt = Instant.now();
    }

    public void onPreUpdate() {
        this.updatedAt = Instant.now();
    }

    public abstract static class Builder<T extends Builder<T>> {

        protected Instant createdAt;
        protected Instant updatedAt;

        @SuppressWarnings("unchecked")
        public T createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return (T) this;
        }

        @SuppressWarnings("unchecked")
        public T updatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
            return (T) this;
        }

        protected abstract T self();

    }

}
