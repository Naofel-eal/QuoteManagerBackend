package com.quotemanager.api.service.implementation;

import com.quotemanager.api.model.Client;
import com.quotemanager.api.repository.ClientRepository;
import com.quotemanager.api.service.ClientService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;

import java.util.Collection;

public class ClientServiceImplementation extends CRUDServiceImplementation<Client, ClientRepository> implements ClientService {
    ClientServiceImplementation(ClientRepository clientRepository) {
        super(clientRepository);
    }
}
