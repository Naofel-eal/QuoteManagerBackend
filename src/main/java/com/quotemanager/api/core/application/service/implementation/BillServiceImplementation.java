package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.core.application.repository.BillRepository;
import com.quotemanager.api.core.application.service.BillService;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.BillRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.BillResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_BillMapper;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
public class BillServiceImplementation extends CRUDServiceImplementation<Bill, BillRequestDTO, BillResponseDTO, BillRepository, IN_BillMapper> implements BillService {
    public BillServiceImplementation(BillRepository billRepository, IN_BillMapper billMapper) {
        super(billRepository, billMapper);
    }
}
