package dev.zalaya.kora.domain.vo;

import java.util.Objects;

public abstract class EntityReference {

    private final Long id;

    public EntityReference(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("The reference id cannot be null");
        }

        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EntityReference that)) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
