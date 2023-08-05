package com.quotemanager.api.core.application.service;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.core.domain.model.Company;

import java.util.List;

public interface CompanyService extends CRUDService<Company> {
    void addClient(Long companyId, Client client);
    void deleteClient(Long companyId, Client client);
    List<Client> getAllClients(Long companyId);

}
