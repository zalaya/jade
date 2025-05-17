package dev.zalaya.jade.provider.domain.model;

import lombok.Getter;

import java.time.Instant;

@Getter
public abstract class Configuration {

    private final String source;
    private final Instant loadedAt;

    protected Configuration(String source) {
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("Source cannot be null or empty");
        }

        this.source = source;
        this.loadedAt = Instant.now();
    }

    public abstract ConfigurationType getType();

}
