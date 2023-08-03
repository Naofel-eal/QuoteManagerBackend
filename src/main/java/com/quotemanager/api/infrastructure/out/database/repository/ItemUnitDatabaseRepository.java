package com.quotemanager.api.infrastructure.out.database.repository;

import com.quotemanager.api.infrastructure.out.database.model.ItemUnitDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemUnitDatabaseRepository extends JpaRepository<ItemUnitDBO, Long> {
}
