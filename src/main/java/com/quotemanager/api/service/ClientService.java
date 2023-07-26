package com.quotemanager.api.service;

import com.quotemanager.api.model.Client;
import com.quotemanager.api.service.template.CRUDService;
import org.springframework.stereotype.Service;

@Service
public interface ClientService extends CRUDService<Client> {
}
