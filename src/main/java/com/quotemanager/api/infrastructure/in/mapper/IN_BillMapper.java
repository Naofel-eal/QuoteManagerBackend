package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.domain.model.Bill;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.BillRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.BillResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IN_BillMapper extends IN_MapperTemplate<Bill, BillRequestDTO, BillResponseDTO> {
}
