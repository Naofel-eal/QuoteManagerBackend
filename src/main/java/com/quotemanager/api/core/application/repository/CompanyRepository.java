package com.quotemanager.api.core.application.repository;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.core.application.repository.template.CRUDRepository;
import com.quotemanager.api.infrastructure.out.database.model.CompanyDBO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CRUDRepository<Company, Long> {}
