package com.quotemanager.api.repository;

import com.quotemanager.api.model.Bill;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends CRUDRepository<Bill, Long> {
    Bill findByReference(String reference);
}
