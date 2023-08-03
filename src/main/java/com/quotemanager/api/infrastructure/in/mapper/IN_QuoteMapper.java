package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.domain.model.Quote;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.QuoteRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.QuoteResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import com.quotemanager.api.infrastructure.out.database.model.QuoteDBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IN_QuoteMapper extends IN_MapperTemplate<Quote, QuoteRequestDTO, QuoteResponseDTO> {
}
