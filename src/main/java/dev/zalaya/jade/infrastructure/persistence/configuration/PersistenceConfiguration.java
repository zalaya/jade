package dev.zalaya.jade.infrastructure.persistence.configuration;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ImportAutoConfiguration({
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class
})
@EnableJpaRepositories(basePackages = "dev.zalaya.jade.infrastructure.persistence")
@EntityScan(basePackages = "dev.zalaya.jade.infrastructure.persistence")
public class PersistenceConfiguration {

}
