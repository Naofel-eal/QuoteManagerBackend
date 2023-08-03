package com.quotemanager.api.application.repository;

import com.quotemanager.api.domain.model.Bill;
import com.quotemanager.api.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BillRepository extends CRUDRepository<Bill, Long> {
}
