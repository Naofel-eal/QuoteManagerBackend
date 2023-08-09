package com.quotemanager.api.infrastructure.out.database.adapter;

import com.quotemanager.api.core.application.repository.CompanyRepository;
import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.infrastructure.out.database.adapter.template.CRUDRepositoryAdapter;
import com.quotemanager.api.infrastructure.out.database.model.CompanyDBO;
import com.quotemanager.api.infrastructure.out.database.repository.CompanyDatabaseRepository;
import com.quotemanager.api.infrastructure.out.mapper.OUT_CompanyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyRepositoryAdapter extends CRUDRepositoryAdapter<Company, CompanyDBO, Long, CompanyDatabaseRepository, OUT_CompanyMapper> implements CompanyRepository {
    public CompanyRepositoryAdapter(CompanyDatabaseRepository companyDatabaseRepository, OUT_CompanyMapper companyMapper) {
        super(companyDatabaseRepository, companyMapper);
    }
}
