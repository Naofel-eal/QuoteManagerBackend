package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IN_CompanyMapper extends IN_MapperTemplate<Company, CompanyRequestDTO, CompanyResponseDTO> {
    @Mapping(source = "ownerId", target = "owner.id")
    Company toDomainEntity(CompanyRequestDTO dtoEntity);
}
