package com.quotemanager.api.infrastructure.in.controller;

import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.core.application.service.CompanyService;
import com.quotemanager.api.infrastructure.in.mapper.IN_CompanyMapper;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/companies")
public class CompanyController {
    private final CompanyService companyService;
    private final IN_CompanyMapper companyMapper;

    public CompanyController(CompanyService companyService, IN_CompanyMapper companyMapper) {
        this.companyService = companyService;
        this.companyMapper = companyMapper;
    }

    @PostMapping("/create")
    public ResponseEntity<CompanyResponseDTO> create(@RequestBody CompanyRequestDTO requestDTO) {
        this.companyService.create(this.companyMapper.toDomainEntity(requestDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CompanyResponseDTO> get(@PathVariable Long id) {
        try {
            CompanyResponseDTO responseDTO = this.companyMapper.toResponseDTO(this.companyService.get(id));
            return ResponseEntity.ok(responseDTO);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/list/{limit}")
    public ResponseEntity<List<CompanyResponseDTO>> list(@PathVariable Integer limit) {
        List<CompanyResponseDTO> responseDTOs = this.companyMapper.toResponseDTOs(this.companyService.list(limit));
        return new ResponseEntity<>(responseDTOs, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CompanyResponseDTO> update(@Valid @RequestBody CompanyRequestDTO requestDTO) {
        this.companyService.update(this.companyMapper.toDomainEntity(requestDTO));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.companyService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*
    @PostMapping("{companyId}/clients/")
    public ResponseEntity<Void> addClient(
            @PathVariable Long companyId,
            @Valid @RequestBody ClientRequestDTO clientRequestDTO
    ) {
        this.companyService.addClient(companyId, clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{companyId}/clients/")
    public ResponseEntity<Void> deleteClient(
            @PathVariable Long companyId,
            @Valid @RequestBody ClientRequestDTO clientRequestDTO
    ) {
        this.companyService.deleteClient(companyId, clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{companyId}/clients/get")
    public ResponseEntity<List<ClientResponseDTO>> getClients(@PathVariable Long companyId) {
        return new ResponseEntity<List<ClientResponseDTO>>(this.companyService.getAllClients(companyId), HttpStatus.OK);
    }
    */
}
