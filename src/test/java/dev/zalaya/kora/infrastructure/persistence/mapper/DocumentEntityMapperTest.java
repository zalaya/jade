package dev.zalaya.kora.infrastructure.persistence.mapper;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ComponentScan("dev.zalaya.kora.infrastructure.persistence.mapper")
class DocumentEntityMapperTest {

    @Autowired
    private DocumentEntityMapper mapper;

}
