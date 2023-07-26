package com.quotemanager.api.controller.template;

import com.quotemanager.api.service.template.CRUDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CRUDController<ENTITY, SERVICE extends CRUDService<ENTITY>> {

    private SERVICE service;

    public CRUDController(SERVICE service) {
        this.service = service;
    }

    @GetMapping("/healthz")
    public ResponseEntity healthz() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody ENTITY entity) {
        this.service.create(entity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity get(@RequestBody int id) {
        return this.s
    }
}
