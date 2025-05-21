package dev.zalaya.jade.persistence.entity;

import java.time.Instant;

public abstract class AuditableEntity {

    protected Instant createdAt;
    protected Instant updatedAt;

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

}
