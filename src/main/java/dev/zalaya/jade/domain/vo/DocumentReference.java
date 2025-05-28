package dev.zalaya.jade.domain.vo;

public final class DocumentReference extends EntityReference {

    public DocumentReference(Long id) {
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

        public DocumentReference build() {
            return new DocumentReference(id);
        }

    }

}
