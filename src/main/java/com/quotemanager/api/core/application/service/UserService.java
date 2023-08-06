package com.quotemanager.api.core.application.service;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.UserRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.UserResponseDTO;

public interface UserService extends CRUDService<User, UserRequestDTO, UserResponseDTO> {
}
