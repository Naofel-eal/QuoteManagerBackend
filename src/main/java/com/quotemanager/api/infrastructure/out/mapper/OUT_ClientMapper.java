package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import com.quotemanager.api.infrastructure.out.database.model.ClientDBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OUT_ClientMapper extends OUT_MapperTemplate<Client, ClientDBO> {
}
