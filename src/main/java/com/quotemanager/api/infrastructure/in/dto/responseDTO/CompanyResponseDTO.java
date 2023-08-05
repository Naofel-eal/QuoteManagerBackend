package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import com.quotemanager.api.core.domain.model.enumeration.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResponseDTO {
    private Long id;
    private String name;
    private String address;
    private String tel;
    private String mail;
    private CompanyStatus status;
    private String SIREN;
    private String SIRET;
    private String RNE;
    private String TVANumber;
    private Float capital;
    private List<ClientResponseDTO> clients;
    private List<Long> quotes;
    private Long ownerId;
}
