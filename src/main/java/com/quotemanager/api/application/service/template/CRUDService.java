package com.quotemanager.api.application.service.template;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface CRUDService<ENTITY> {
    void create(ENTITY entity);
    ENTITY get(Long id) ;
    void update(ENTITY entity);
    void delete(Long id);
    List<ENTITY> list(Integer limit);

}
