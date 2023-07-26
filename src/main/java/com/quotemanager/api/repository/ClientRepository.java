package com.quotemanager.api.repository;

import com.quotemanager.api.model.Client;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CRUDRepository<Client, Long> {

}
