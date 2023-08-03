package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.domain.model.User;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.UserRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.UserResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import com.quotemanager.api.infrastructure.out.database.model.UserDBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IN_UserMapper extends IN_MapperTemplate<User, UserRequestDTO, UserResponseDTO> {
}
