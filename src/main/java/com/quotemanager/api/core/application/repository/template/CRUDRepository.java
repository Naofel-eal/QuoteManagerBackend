package com.quotemanager.api.core.application.repository.template;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CRUDRepository<ENTITY, ID_TYPE> {
    void save(ENTITY entity);
    ENTITY getReferenceById(ID_TYPE id);
    void deleteById(ID_TYPE id);
    List<ENTITY> findAll(Pageable limit);
}
