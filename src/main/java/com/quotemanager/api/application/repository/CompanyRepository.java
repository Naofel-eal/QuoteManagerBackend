package com.quotemanager.api.application.repository;

import com.quotemanager.api.domain.model.Company;
import com.quotemanager.api.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CRUDRepository<Company, Long> {
}
