package com.quotemanager.api.core.application.service;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ClientRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.ClientResponseDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;

import java.util.List;

public interface CompanyService extends CRUDService<Company, CompanyRequestDTO, CompanyResponseDTO> {
    void addClient(Long companyId, ClientRequestDTO client);
    void deleteClient(Long companyId, ClientRequestDTO client);
    List<ClientResponseDTO> getAllClients(Long companyId);
}
