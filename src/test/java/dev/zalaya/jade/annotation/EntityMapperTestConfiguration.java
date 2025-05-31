package dev.zalaya.jade.annotation;

import dev.zalaya.jade.infrastructure.persistence.mapper.*;

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
public @interface EntityMapperTestConfiguration {

}
