package com.quotemanager.api.controller.template;

import com.quotemanager.api.service.template.CRUDService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

public class CRUDController<ENTITY, SERVICE extends CRUDService<ENTITY>> {

    private SERVICE service;

    public CRUDController(SERVICE service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<ENTITY> create(@Valid @RequestBody ENTITY entity) {
        ENTITY resultEntity = this.service.create(entity);
        return new ResponseEntity<>(resultEntity, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ENTITY> get(@PathVariable Long id) {
        ENTITY entity = this.service.get(id);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/list/{limit}")
    public ResponseEntity<Collection<ENTITY>> list(@PathVariable int limit) {
        Collection<ENTITY> entities = this.service.list(limit);
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ENTITY> update(@Valid @RequestBody ENTITY entity) {
        ENTITY resultEntity = this.service.update(entity);
        return new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
