package com.quotemanager.api.service.template;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface CRUDService<ENTITY> {
    ENTITY create(ENTITY entity);
    ENTITY get(long id);
    Collection<ENTITY> list(int limit);
    ENTITY update(ENTITY entity);
    void delete(long id);
}
