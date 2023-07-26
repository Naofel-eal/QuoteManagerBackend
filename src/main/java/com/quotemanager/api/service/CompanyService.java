package com.quotemanager.api.service;

import com.quotemanager.api.model.Client;
import com.quotemanager.api.model.Company;
import com.quotemanager.api.service.template.CRUDService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface CompanyService extends CRUDService<Company> {

    public Boolean addClient(Long clientId);
    public void removeClient(Long clientId);
    public Collection<Client> getAllClients(Long companyId);
}
