package br.com.bighead.spring.examples.core.config;

import br.com.bighead.spring.examples.core.repository.ItemRepository;
import br.com.bighead.spring.examples.core.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotedConfig {

    @Bean
    public ItemRepository itemRepository(){
        return new ItemRepository();
    }

    @Bean
    ItemService itemService(){
        return new ItemService();
    }
}
