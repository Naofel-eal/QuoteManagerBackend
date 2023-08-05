package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.domain.model.Quote;
import com.quotemanager.api.core.application.repository.QuoteRepository;
import com.quotemanager.api.core.application.service.QuoteService;
import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
public class QuoteServiceImplementation extends CRUDServiceImplementation<Quote, QuoteRepository> implements QuoteService {
    public QuoteServiceImplementation(QuoteRepository quoteRepository) {
        super(quoteRepository);
    }
}