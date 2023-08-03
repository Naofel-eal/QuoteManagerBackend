package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.domain.model.Company;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")/* , uses = IN_UserMapper.class)*/
public interface IN_CompanyMapper extends IN_MapperTemplate<Company, CompanyRequestDTO, CompanyResponseDTO> {
    /*
    @Mapping(source = "ownerId", target = "owner.id")
    Company fromDTO(CompanyRequestDTO dto);

    @Mapping(source = "owner.id", target = "ownerId")
    CompanyResponseDTO toDTO(Company entity);

    @Mapping(source = "id", target = "id")
    Company companyFromId(Long id);
    */
}
