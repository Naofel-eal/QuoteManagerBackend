package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.domain.model.Item;
import com.quotemanager.api.core.domain.model.Quote;
import com.quotemanager.api.core.domain.model.enumeration.ItemUnit;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ItemRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.QuoteRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.QuoteResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface IN_QuoteMapper extends IN_MapperTemplate<Quote, QuoteRequestDTO, QuoteResponseDTO> {
    @Mapping(source = "unit", target = "unit", qualifiedByName = "mapItemUnitToString")
    Item toItem(ItemRequestDTO itemDTO);

    @Named("mapItemUnitToString")
    default String mapItemUnitToString(ItemUnit unit) {
        return unit.getItemUnit();
    }
}
