package com.quotemanager.api.infrastructure.out.database.repository;

import com.quotemanager.api.infrastructure.out.database.model.CompanyDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDatabaseRepository extends JpaRepository<CompanyDBO, Long> {
}
