package com.quotemanager.api.core.application.repository;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.core.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CRUDRepository<Company, Long> {
}
