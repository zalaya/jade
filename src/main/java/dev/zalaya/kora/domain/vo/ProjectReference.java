package dev.zalaya.kora.domain.vo;

public final class ProjectReference extends EntityReference {

    public ProjectReference(Long id) {
        super(id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private Long id;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public ProjectReference build() {
            return new ProjectReference(id);
        }

    }

}
