package com.quotemanager.api.core.application.service.implementation;

import com.quotemanager.api.core.application.repository.UserRepository;
import com.quotemanager.api.core.application.service.UserService;
import com.quotemanager.api.core.application.service.implementation.template.CRUDServiceImplementation;
import com.quotemanager.api.core.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation extends CRUDServiceImplementation<User, UserRepository> implements UserService {
    UserServiceImplementation(UserRepository userRepository) {
        super(userRepository);
    }
}
