package com.quotemanager.api.infrastructure.out.database.repository;

import com.quotemanager.api.infrastructure.out.database.model.ClientDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDatabaseRepository extends JpaRepository<ClientDBO, Long> {
}
