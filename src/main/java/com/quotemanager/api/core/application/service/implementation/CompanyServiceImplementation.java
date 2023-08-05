package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.application.repository.CompanyRepository;
import com.quotemanager.api.core.application.service.CompanyService;
import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.core.domain.model.Company;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Slf4j
public class CompanyServiceImplementation extends CRUDServiceImplementation<Company, CompanyRepository> implements CompanyService {
    public CompanyServiceImplementation(CompanyRepository companyRepository) {
        super(companyRepository);
    }
    @Override
    public void addClient(Long companyId, Client client) {
        Company company = this.repository.getReferenceById(companyId);
        company.addClient(client);
        this.repository.save(company);
    }

    @Override
    public void deleteClient(Long companyId, Client client) {
        Company company = this.repository.getReferenceById(companyId);
        company.removeClient(client);
        this.repository.save(company);
    }

    @Override
    public List<Client> getAllClients(Long companyId) {
        return this.repository.getReferenceById(companyId).getClients();
    }

}
