package com.quotemanager.api.infrastructure.in.controller;

import com.quotemanager.api.core.application.service.UserService;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.in.controller.template.CRUDController;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.UserRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.UserResponseDTO;
import com.quotemanager.api.infrastructure.in.mapper.IN_UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends CRUDController<User, UserService, UserRequestDTO, UserResponseDTO, IN_UserMapper> {
    UserController(UserService userService, IN_UserMapper userMapper) {
        super(userService, userMapper);
    }
}
