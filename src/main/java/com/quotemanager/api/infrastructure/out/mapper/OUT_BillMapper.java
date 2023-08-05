package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.infrastructure.out.database.model.BillDBO;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OUT_BillMapper extends OUT_MapperTemplate<Bill, BillDBO> {
}
