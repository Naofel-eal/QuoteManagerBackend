package com.quotemanager.api.service.implementation;
import com.quotemanager.api.model.User;
import com.quotemanager.api.repository.UserRepository;
import com.quotemanager.api.service.UserService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;


public class UserServiceImplementation extends CRUDServiceImplementation<User, UserRepository> implements UserService {
    public UserServiceImplementation(UserRepository userRepository) {
        super(userRepository);
    }
}
