package com.quotemanager.api.infrastructure.out.database.adapter;

import com.quotemanager.api.application.repository.BillRepository;
import com.quotemanager.api.domain.model.Bill;
import com.quotemanager.api.infrastructure.out.database.adapter.template.CRUDRepositoryAdapter;
import com.quotemanager.api.infrastructure.out.database.model.BillDBO;
import com.quotemanager.api.infrastructure.out.database.repository.BillDatabaseRepository;
import com.quotemanager.api.infrastructure.out.mapper.OUT_BillMapper;
import org.springframework.stereotype.Service;

@Service
public class BillRepositoryAdapter extends CRUDRepositoryAdapter<Bill, BillDBO, Long, BillDatabaseRepository, OUT_BillMapper> implements BillRepository {
    public BillRepositoryAdapter(BillDatabaseRepository billDatabaseRepository, OUT_BillMapper mapper) {
        super(billDatabaseRepository, mapper);
    }
}