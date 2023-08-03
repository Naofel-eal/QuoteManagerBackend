package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.domain.model.Quote;
import com.quotemanager.api.infrastructure.out.database.model.QuoteDBO;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OUT_QuoteMapper extends OUT_MapperTemplate<Quote, QuoteDBO> {
}
