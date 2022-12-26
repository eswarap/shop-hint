package org.woven.enterprise.catalogservice.component;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.woven.enterprise.catalogservice.entity.CatalogItem;
import org.woven.enterprise.catalogservice.jpa.CatalogItemRepository;

@Component
public class ItemInitializer implements CommandLineRunner {
    private final CatalogItemRepository catalogItemRepository;

    private ItemInitializer(CatalogItemRepository itemRepository) {
        this.catalogItemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> catalogItemRepository.save(new CatalogItem(item)));

                catalogItemRepository.findAll().forEach(System.out::println);
    }
}