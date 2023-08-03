package com.quotemanager.api.infrastructure.out.mapper;

import com.quotemanager.api.domain.model.User;
import com.quotemanager.api.infrastructure.out.database.model.UserDBO;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OUT_UserMapper extends OUT_MapperTemplate<User, UserDBO> {

}
