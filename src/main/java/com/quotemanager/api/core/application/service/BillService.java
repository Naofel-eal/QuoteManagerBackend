package com.quotemanager.api.core.application.service;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.BillRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.BillResponseDTO;

public interface BillService extends CRUDService<Bill, BillRequestDTO, BillResponseDTO> {
}
