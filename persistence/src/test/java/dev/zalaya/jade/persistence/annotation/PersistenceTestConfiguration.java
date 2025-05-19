package dev.zalaya.jade.persistence.annotation;

import dev.zalaya.jade.persistence.configuration.PersistenceConfiguration;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(SpringExtension.class)
@Transactional
@ContextConfiguration(classes = PersistenceConfiguration.class)
public @interface PersistenceTestConfiguration {

}
