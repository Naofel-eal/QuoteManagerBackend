package com.quotemanager.api.service;

import com.quotemanager.api.model.Bill;
import com.quotemanager.api.service.template.CRUDService;
import org.springframework.stereotype.Service;

@Service
public interface BillService extends CRUDService<Bill> {
}
