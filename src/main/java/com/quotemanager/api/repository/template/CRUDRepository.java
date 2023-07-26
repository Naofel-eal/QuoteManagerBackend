package com.quotemanager.api.repository.template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CRUDRepository<ENTITY, ID_TYPE> extends JpaRepository<ENTITY, ID_TYPE> {
}
