package com.quotemanager.api.infrastructure.out.database.adapter;

import com.quotemanager.api.core.application.repository.UserRepository;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.out.database.adapter.template.CRUDRepositoryAdapter;
import com.quotemanager.api.infrastructure.out.database.model.UserDBO;
import com.quotemanager.api.infrastructure.out.database.repository.UserDatabaseRepository;
import com.quotemanager.api.infrastructure.out.mapper.OUT_UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryAdapter extends CRUDRepositoryAdapter<User, UserDBO, Long, UserDatabaseRepository, OUT_UserMapper> implements UserRepository {
    public UserRepositoryAdapter(UserDatabaseRepository userDatabaseRepository, OUT_UserMapper userMapper) {
        super(userDatabaseRepository, userMapper);
    }
}
