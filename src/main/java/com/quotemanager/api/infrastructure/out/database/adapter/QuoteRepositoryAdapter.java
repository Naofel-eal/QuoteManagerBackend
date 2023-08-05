package com.quotemanager.api.infrastructure.out.database.adapter;

import com.quotemanager.api.core.application.repository.QuoteRepository;
import com.quotemanager.api.core.domain.model.Quote;
import com.quotemanager.api.infrastructure.out.database.adapter.template.CRUDRepositoryAdapter;
import com.quotemanager.api.infrastructure.out.database.model.QuoteDBO;
import com.quotemanager.api.infrastructure.out.database.repository.QuoteDatabaseRepository;
import com.quotemanager.api.infrastructure.out.mapper.OUT_QuoteMapper;
import org.springframework.stereotype.Service;

@Service
public class QuoteRepositoryAdapter extends CRUDRepositoryAdapter<Quote, QuoteDBO, Long, QuoteDatabaseRepository, OUT_QuoteMapper> implements QuoteRepository {
    public QuoteRepositoryAdapter(QuoteDatabaseRepository quoteDatabaseRepository, OUT_QuoteMapper quoteMapper
    ) {
        super(quoteDatabaseRepository, quoteMapper);
    }
}
