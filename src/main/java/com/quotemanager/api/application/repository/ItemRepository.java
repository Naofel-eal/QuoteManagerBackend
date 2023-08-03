package com.quotemanager.api.application.repository;

import com.quotemanager.api.domain.model.Item;
import com.quotemanager.api.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CRUDRepository<Item, Long> {
}
