package com.quotemanager.api.repository;

import com.quotemanager.api.model.Item;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CRUDRepository<Item, Long> {
}
