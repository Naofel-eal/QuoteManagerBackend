package com.quotemanager.api.infrastructure.in.controller;

import com.quotemanager.api.core.domain.model.Company;
import com.quotemanager.api.infrastructure.in.controller.template.CRUDController;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.ClientRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.requestDTO.CompanyRequestDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.ClientResponseDTO;
import com.quotemanager.api.infrastructure.in.dto.responseDTO.CompanyResponseDTO;
import com.quotemanager.api.core.application.service.CompanyService;
import com.quotemanager.api.infrastructure.in.mapper.IN_CompanyMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/companies")
public class CompanyController extends CRUDController<Company, CompanyService, CompanyRequestDTO, CompanyResponseDTO, IN_CompanyMapper> {
    CompanyController(CompanyService companyService, IN_CompanyMapper companyMapper) {
        super(companyService, companyMapper);
    }


    //ROUTES FOR CLIENTS MANAGEMENT
    @PostMapping("{companyId}/clients/")
    public ResponseEntity<Void> addClient(
            @PathVariable Long companyId,
            @Valid @RequestBody ClientRequestDTO clientRequestDTO
    ) {
        this.service.addClient(companyId, clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{companyId}/clients/")
    public ResponseEntity<Void> deleteClient(
            @PathVariable Long companyId,
            @Valid @RequestBody ClientRequestDTO clientRequestDTO
    ) {
        this.service.deleteClient(companyId, clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{companyId}/clients/get")
    public ResponseEntity<List<ClientResponseDTO>> getClients(@PathVariable Long companyId) {
        return new ResponseEntity<List<ClientResponseDTO>>(this.service.getAllClients(companyId), HttpStatus.OK);
    }
}
