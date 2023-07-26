package com.quotemanager.api.repository;

import com.quotemanager.api.model.User;
import com.quotemanager.api.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CRUDRepository<User, Long> {
    User findByMail(String mail);
}
