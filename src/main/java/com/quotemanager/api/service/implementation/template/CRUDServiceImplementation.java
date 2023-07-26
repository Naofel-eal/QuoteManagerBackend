package com.quotemanager.api.service.implementation.template;

import com.quotemanager.api.service.template.CRUDService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public abstract class CRUDServiceImplementation<ENTITY, REPOSITORY extends JpaRepository<ENTITY, Long>> implements CRUDService<ENTITY> {
    private  final REPOSITORY repository;
    public CRUDServiceImplementation(REPOSITORY repository) {
        this.repository = repository;
    }

    @Override
    public ENTITY create(ENTITY entity) {
        return this.repository.save(entity);
    }

    @Override
    public ENTITY get(long id) {
        return this.repository.getById(id);
    }

    @Override
    public ENTITY update(ENTITY entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(long id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<ENTITY> list(int limit) {
        return this.repository.findAll(PageRequest.of(0, limit)).toList();
    }
}
