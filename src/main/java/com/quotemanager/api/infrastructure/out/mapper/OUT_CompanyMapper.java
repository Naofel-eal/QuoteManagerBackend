package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import com.quotemanager.api.infrastructure.out.database.model.CompanyDBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = OUT_ClientMapper.class)
public interface OUT_CompanyMapper extends OUT_MapperTemplate<Company, CompanyDBO> {
}
