package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.domain.model.Item;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ItemRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.ItemResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IN_ItemMapper extends IN_MapperTemplate<Item, ItemRequestDTO, ItemResponseDTO> {
}
