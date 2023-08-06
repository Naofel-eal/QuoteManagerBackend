package com.quotemanager.api.core.application.service.implementation.template;

import com.quotemanager.api.core.application.repository.template.CRUDRepository;
import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public abstract class CRUDServiceImplementation<ENTITY, REQUEST_DTO, RESPONSE_DTO, REPOSITORY extends CRUDRepository<ENTITY, Long>, MAPPER extends IN_MapperTemplate<ENTITY, REQUEST_DTO, RESPONSE_DTO>> implements CRUDService<ENTITY, REQUEST_DTO, RESPONSE_DTO> {
    protected final CRUDRepository<ENTITY, Long> repository;
    protected final MAPPER mapper;
    public CRUDServiceImplementation(REPOSITORY repository, MAPPER mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void create(REQUEST_DTO requestDTO) {
        ENTITY entity = this.mapper.toDomainEntity(requestDTO);
        this.repository.save(this.mapper.toDomainEntity(requestDTO));
    }

    @Override
    public RESPONSE_DTO get(Long id) {
        return this.mapper.toResponseDTO(this.repository.getReferenceById(id));
    }

    @Override
    public void update(REQUEST_DTO requestDTO) {
        this.repository.save(this.mapper.toDomainEntity(requestDTO));
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<RESPONSE_DTO> list(Integer limit) {
        return this.mapper.toResponseDTOs(this.repository.findAll(PageRequest.of(0, limit)));
    }
}
