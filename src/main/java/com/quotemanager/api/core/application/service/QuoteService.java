package com.quotemanager.api.core.application.service;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.Quote;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.QuoteRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.QuoteResponseDTO;

public interface QuoteService extends CRUDService<Quote, QuoteRequestDTO, QuoteResponseDTO> {
}