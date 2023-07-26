package com.quotemanager.api.repository;

import com.quotemanager.api.model.Company;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CRUDRepository<Company, Long> {
}
