package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import com.quotemanager.api.infrastructure.out.database.model.CompanyDBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {OUT_ClientMapper.class, OUT_QuoteMapper.class})
public interface OUT_CompanyMapper extends OUT_MapperTemplate<Company, CompanyDBO> {
    @Override
    @Mapping(target = "owner", ignore = true)
    Company toDomainEntity(CompanyDBO dbEntity);
}
