package com.quotemanager.api.infrastructure.in.dto.requestDTO;

import com.quotemanager.api.domain.model.enumeration.CompanyStatus;

public record CompanyRequestDTO(
        String name,
        String address,
        String tel,
        String mail,
        CompanyStatus status,
        String SIREN,
        String SIRET,
        String RNE,
        String TVANumber,
        Float capital,
        Long ownerId
){}
