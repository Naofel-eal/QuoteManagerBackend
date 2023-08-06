package com.quotemanager.api.infrastructure.in.controller.template;

import com.quotemanager.api.core.application.service.template.CRUDService;
import com.quotemanager.api.core.domain.model.User;
import com.quotemanager.api.infrastructure.in.mapper.template.IN_MapperTemplate;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class CRUDController<ENTITY, SERVICE extends CRUDService<ENTITY, REQUEST_DTO, RESPONSE_DTO>, REQUEST_DTO, RESPONSE_DTO, MAPPER extends IN_MapperTemplate<ENTITY, REQUEST_DTO, RESPONSE_DTO>> {
    protected SERVICE service;
    protected MAPPER mapper;

    public CRUDController(SERVICE service, MAPPER mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping("/create")
    public ResponseEntity<RESPONSE_DTO> create(@RequestBody REQUEST_DTO requestDTO) {
        this.service.create(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<RESPONSE_DTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.get(id));
    }

    @GetMapping("/list/{limit}")
    public ResponseEntity<List<RESPONSE_DTO>> list(@PathVariable Integer limit) {
        return new ResponseEntity<>(this.service.list(limit), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<RESPONSE_DTO> update(@Valid @RequestBody REQUEST_DTO requestDTO) {
        this.service.update(requestDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
