package com.quotemanager.api.infrastructure.in.mapper.template;

import java.util.List;

public interface IN_MapperTemplate<DOMAIN_ENTITY, REQUEST_DTO, RESPONSE_DTO> {
    DOMAIN_ENTITY toDomainEntity(REQUEST_DTO dtoEntity);
    RESPONSE_DTO toResponseDTO(DOMAIN_ENTITY domainEntity);
    List<DOMAIN_ENTITY> toDomainEntities(List<REQUEST_DTO> dtoEntities);
    List<RESPONSE_DTO> toResponseDTOs(List<DOMAIN_ENTITY> entities);
}
