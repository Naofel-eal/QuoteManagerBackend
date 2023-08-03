package com.quotemanager.api.infrastructure.out.database.adapter.template;

import com.quotemanager.api.application.repository.template.CRUDRepository;
import com.quotemanager.api.infrastructure.out.mapper.template.OUT_MapperTemplate;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class CRUDRepositoryAdapter<DOMAIN_ENTITY, DB_ENTITY, ID_TYPE, REPOSITORY extends JpaRepository<DB_ENTITY, ID_TYPE>, MAPPER extends OUT_MapperTemplate<DOMAIN_ENTITY, DB_ENTITY>> implements CRUDRepository<DOMAIN_ENTITY, ID_TYPE> {
    protected REPOSITORY repository;
    protected MAPPER mapper;
    public CRUDRepositoryAdapter(REPOSITORY repository, MAPPER mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void save(DOMAIN_ENTITY entity) {
        this.repository.save(this.mapper.toDatabaseEntity(entity));
    }

    @Override
    public DOMAIN_ENTITY getReferenceById(ID_TYPE id) {
        return this.mapper.toDomainEntity(this.repository.getReferenceById(id));
    }

    @Override
    public void deleteById(ID_TYPE id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<DOMAIN_ENTITY> findAll(Pageable limit) {
        return this.mapper.toDomainEntities(this.repository.findAll(limit).toList());
    }
}
