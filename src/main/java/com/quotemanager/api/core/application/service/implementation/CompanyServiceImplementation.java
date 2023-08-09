package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.application.repository.CompanyRepository;
import com.quotemanager.api.core.application.service.CompanyService;
import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ClientRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.ClientResponseDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_ClientMapper;
import com.quotemanager.api.infrastructure.in.mapper.IN_CompanyMapper;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Slf4j
public class CompanyServiceImplementation extends CRUDServiceImplementation<Company, CompanyRequestDTO, CompanyResponseDTO, CompanyRepository, IN_CompanyMapper> implements CompanyService {
    private final IN_ClientMapper clientMapper;
    public CompanyServiceImplementation(CompanyRepository companyRepository, IN_CompanyMapper companyMapper, IN_ClientMapper clientMapper) {
        super(companyRepository, companyMapper);
        this.clientMapper = clientMapper;
    }
    @Override
    public void addClient(CompanyRequestDTO companyRequestDTO, ClientRequestDTO client) {
        Company company = this.repository.getReferenceById(companyRequestDTO.getId());
        company.addClient(this.clientMapper.toDomainEntity(client));
        this.repository.save(company);
    }

    @Override
    public void deleteClient(CompanyRequestDTO companyRequestDTO, ClientRequestDTO client) {
        Company company = this.repository.getReferenceById(companyRequestDTO.getId());
        company.removeClient(this.clientMapper.toDomainEntity(client));
        this.repository.save(company);
    }

    @Override
    public List<ClientResponseDTO> getAllClients(CompanyRequestDTO companyRequestDTO) {
        return this.clientMapper.toResponseDTOs(this.repository.getReferenceById(companyRequestDTO.getId()).getClients());
    }
}
