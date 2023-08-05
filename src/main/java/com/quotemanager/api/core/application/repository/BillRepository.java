package com.quotemanager.api.core.application.repository;

import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.core.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BillRepository extends CRUDRepository<Bill, Long> {
}
