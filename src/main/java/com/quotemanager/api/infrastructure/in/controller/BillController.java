package com.quotemanager.api.infrastructure.in.controller;

import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.infrastructure.in.controller.template.CRUDController;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.BillRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.BillResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_BillMapper;
import com.quotemanager.api.core.application.service.BillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bill")
public class BillController extends CRUDController<Bill, BillService, BillRequestDTO, BillResponseDTO, IN_BillMapper> {
    public BillController(BillService billService, IN_BillMapper billMapper) {
        super(billService, billMapper);
    }
}
