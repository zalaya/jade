package dev.zalaya.jade.provider.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class LicenseConfiguration extends Configuration {

    String author;
    String year;
    LicenseType type;

    @Override
    public ConfigurationType getType() {
        return ConfigurationType.LICENSE;
    }

}
