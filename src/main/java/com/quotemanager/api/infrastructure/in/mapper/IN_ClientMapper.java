package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.application.service.CompanyService;
import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ClientRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.ClientResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IN_ClientMapper extends IN_MapperTemplate<Client, ClientRequestDTO, ClientResponseDTO> {
    /*
    @Mapping(source = "companyId", target = "company")
    Client toDomainEntity(ClientRequestDTO requestDTO);
    */
}