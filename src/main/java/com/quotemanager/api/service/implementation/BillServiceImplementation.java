package com.quotemanager.api.service.implementation;

import com.quotemanager.api.model.Bill;
import com.quotemanager.api.repository.BillRepository;
import com.quotemanager.api.service.BillService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;

public class BillServiceImplementation extends CRUDServiceImplementation<Bill, BillRepository> implements BillService {
    public BillServiceImplementation(BillRepository billRepository) {
        super(billRepository);
    }
}
