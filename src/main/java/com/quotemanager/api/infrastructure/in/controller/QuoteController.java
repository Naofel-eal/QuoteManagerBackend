package com.quotemanager.api.infrastructure.in.controller;

import com.quotemanager.api.core.domain.model.Quote;
import com.quotemanager.api.infrastructure.in.controller.template.CRUDController;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.QuoteRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.QuoteResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_QuoteMapper;
import com.quotemanager.api.core.application.service.QuoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/quotes")
public class QuoteController extends CRUDController<Quote, QuoteService, QuoteRequestDTO, QuoteResponseDTO, IN_QuoteMapper> {
    QuoteController(QuoteService quoteService, IN_QuoteMapper quoteMapper) {
        super(quoteService, quoteMapper);
    }
}
