package com.quotemanager.api.infrastructure.out.database.repository;

import com.quotemanager.api.infrastructure.out.database.model.BillDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDatabaseRepository extends JpaRepository<BillDBO, Long> {
}
