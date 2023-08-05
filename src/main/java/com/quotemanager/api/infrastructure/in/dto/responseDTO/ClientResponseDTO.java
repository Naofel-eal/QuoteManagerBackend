package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import com.quotemanager.api.core.domain.model.enumeration.ClientType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {
    private Long id;
    private String name;
    private String mail;
    private String tel;
    private String address;
    private String details;
    private ClientType clientType;
}
