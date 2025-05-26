package dev.zalaya.jade.infrastructure.persistence.annotation;

import dev.zalaya.jade.infrastructure.persistence.project.ProjectEntityMapperImpl;
import dev.zalaya.jade.infrastructure.persistence.document.DocumentEntityMapperImpl;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(SpringExtension.class)
@Import({
    ProjectEntityMapperImpl.class,
    DocumentEntityMapperImpl.class
})
public @interface MapperTestConfiguration {

}