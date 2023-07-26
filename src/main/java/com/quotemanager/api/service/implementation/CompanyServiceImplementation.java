package com.quotemanager.api.service.implementation;

import com.quotemanager.api.model.Client;
import com.quotemanager.api.model.Company;
import com.quotemanager.api.repository.CompanyRepository;
import com.quotemanager.api.service.CompanyService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;

import java.util.Collection;

public class CompanyServiceImplementation extends CRUDServiceImplementation<Company, CompanyRepository> implements CompanyService {
    public CompanyServiceImplementation(CompanyRepository companyRepository) {
        super(companyRepository);
    }
    @Override
    public Boolean addClient(Long clientId) {
        return null;
    }

    @Override
    public void removeClient(Long clientId) {

    }

    @Override
    public Collection<Client> getAllClients(Long companyId) {
        return null;
    }
}
