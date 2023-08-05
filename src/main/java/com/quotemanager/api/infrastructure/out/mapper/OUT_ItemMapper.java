package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.core.domain.model.Item;
import com.quotemanager.api.infrastructure.out.database.model.ItemDBO;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OUT_ItemMapper extends OUT_MapperTemplate<Item, ItemDBO> {
}
