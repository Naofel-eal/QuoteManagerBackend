package com.quotemanager.api.infrastructure.in.dto.requestDTO;

import com.quotemanager.api.core.domain.model.enumeration.ClientType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequestDTO {
    private String name;
    private String mail;
    private String tel;
    private String address;
    private String details;
    private ClientType clientType;
    private Long companyId;
}
