package com.quotemanager.api.core.application.service.template;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface CRUDService<ENTITY, REQUEST_DTO, RESPONSE_DTO> {
    void create(REQUEST_DTO entity);
    RESPONSE_DTO get(Long id) ;
    void update(REQUEST_DTO entity);
    void delete(Long id);
    List<RESPONSE_DTO> list(Integer limit);

}
