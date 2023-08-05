package com.quotemanager.api.infrastructure.in.mapper;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.UserRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.UserResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Collections;
import java.util.List;

@Mapper(componentModel = "spring", uses = IN_CompanyMapper.class)
public interface IN_UserMapper extends IN_MapperTemplate<User, UserRequestDTO, UserResponseDTO> {
}
