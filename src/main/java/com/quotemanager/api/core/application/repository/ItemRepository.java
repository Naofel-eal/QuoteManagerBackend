package com.quotemanager.api.core.application.repository;

import com.quotemanager.api.core.domain.model.Item;
import com.quotemanager.api.core.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CRUDRepository<Item, Long> {
}
