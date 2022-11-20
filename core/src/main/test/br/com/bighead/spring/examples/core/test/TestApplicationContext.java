package br.com.bighead.spring.examples.core.test;

import br.com.bighead.spring.examples.core.config.AnnotedConfig;
import br.com.bighead.spring.examples.core.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestApplicationContext {


    @Test
    public void givenAnnotationConfigAppContext_whenSpringConfig_thenMappingSuccess() {
        var context = new AnnotationConfigApplicationContext(AnnotedConfig.class);
        var itemService = context.getBean(ItemService.class);

        assertNotNull(itemService);
        assertNotNull(itemService.listItems());
        assertEquals(itemService.listItems().length,3);

        ((AnnotationConfigApplicationContext) context).close();
    }
}
