package com.quotemanager.api.application.repository;

import com.quotemanager.api.domain.model.User;
import com.quotemanager.api.application.repository.template.CRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CRUDRepository<User, Long> {
}
