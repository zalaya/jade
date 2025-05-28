package dev.zalaya.jade.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.time.Instant;

@MappedSuperclass
public abstract class AuditableEntity {

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at")
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

    @PrePersist
    public void onPrePersist() {
        this.createdAt = Instant.now();
    }

    @PreUpdate
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

        public Instant getCreatedAt() {
            return createdAt;
        }

        public Instant getUpdatedAt() {
            return updatedAt;
        }

        protected abstract T self();

    }

}
