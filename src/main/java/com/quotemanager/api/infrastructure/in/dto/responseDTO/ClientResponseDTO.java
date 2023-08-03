package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import com.quotemanager.api.domain.model.enumeration.ClientType;

public record ClientResponseDTO(
        Long id,
        String name,
        String mail,
        String tel,
        String address,
        String details,
        ClientType clientType,
        Long companyId
){}
