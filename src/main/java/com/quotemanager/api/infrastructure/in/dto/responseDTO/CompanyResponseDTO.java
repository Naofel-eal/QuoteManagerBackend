package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import com.quotemanager.api.domain.model.enumeration.CompanyStatus;

public record CompanyResponseDTO(
        Long id,
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
