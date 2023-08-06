package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.application.repository.UserRepository;
import com.quotemanager.api.core.application.service.UserService;
import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.UserRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.UserResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation extends CRUDServiceImplementation<User, UserRequestDTO, UserResponseDTO, UserRepository, IN_UserMapper> implements UserService {
    UserServiceImplementation(UserRepository userRepository, IN_UserMapper userMapper) {
        super(userRepository, userMapper);
    }
}
