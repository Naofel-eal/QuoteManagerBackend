package com.quotemanager.api.infrastructure.in.dto.requestDTO;

import com.quotemanager.api.domain.model.enumeration.ClientType;

public record ClientRequestDTO(
        String name,
        String mail,
        String tel,
        String address,
        String details,
        ClientType clientType,
        Long companyId
){}
