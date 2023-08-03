package com.quotemanager.api.application.repository;

import com.quotemanager.api.domain.model.Quote;
import com.quotemanager.api.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CRUDRepository<Quote, Long> {
}
