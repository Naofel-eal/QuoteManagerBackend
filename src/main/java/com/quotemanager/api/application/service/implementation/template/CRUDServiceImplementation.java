package com.quotemanager.api.application.service.implementation.template;

import com.quotemanager.api.application.repository.template.CRUDRepository;
import com.quotemanager.api.application.service.template.CRUDService;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public abstract class CRUDServiceImplementation<ENTITY, REPOSITORY extends CRUDRepository<ENTITY, Long>> implements CRUDService<ENTITY> {
    protected final CRUDRepository<ENTITY, Long> repository;
    public CRUDServiceImplementation(REPOSITORY repository) {
        this.repository = repository;
    }

    @Override
    public void create(ENTITY entity) {
        this.repository.save(entity);
    }

    @Override
    public ENTITY get(Long id) {
        return this.repository.getReferenceById(id);
    }

    @Override
    public void update(ENTITY entity) {
        this.repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<ENTITY> list(Integer limit) {
        return this.repository.findAll(PageRequest.of(0, limit));
    }
}
