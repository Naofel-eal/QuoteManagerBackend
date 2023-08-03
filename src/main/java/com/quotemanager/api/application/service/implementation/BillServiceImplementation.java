package com.quotemanager.api.application.service.implementation;

import com.quotemanager.api.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.domain.model.Bill;
import com.quotemanager.api.application.repository.BillRepository;
import com.quotemanager.api.application.service.BillService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
public class BillServiceImplementation extends CRUDServiceImplementation<Bill, BillRepository> implements BillService {
    public BillServiceImplementation(BillRepository billRepository) {
        super(billRepository);
    }
}
