package br.com.bighead.spring.examples.core.service;

import br.com.bighead.spring.examples.core.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemService {

    @Autowired
    ItemRepository repo;


    public String[] listItems(){
        return repo.list();
    }
}
