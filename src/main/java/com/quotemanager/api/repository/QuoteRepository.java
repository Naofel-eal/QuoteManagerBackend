package com.quotemanager.api.repository;

import com.quotemanager.api.model.Quote;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CRUDRepository<Quote, Long> {
    Quote findByReference(String reference);
}
