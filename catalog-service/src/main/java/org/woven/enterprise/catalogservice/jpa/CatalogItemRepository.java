package org.woven.enterprise.catalogservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.woven.enterprise.catalogservice.entity.CatalogItem;

@RepositoryRestResource
public interface CatalogItemRepository extends JpaRepository<CatalogItem, Long> {
    
}