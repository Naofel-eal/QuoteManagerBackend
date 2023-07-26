package com.quotemanager.api.service.implementation;

import com.quotemanager.api.model.Quote;
import com.quotemanager.api.repository.QuoteRepository;
import com.quotemanager.api.service.QuoteService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;

public class QuoteServiceImplementation extends CRUDServiceImplementation<Quote, QuoteRepository> implements QuoteService {
    public QuoteServiceImplementation(QuoteRepository quoteRepository) {
        super(quoteRepository);
    }
}
