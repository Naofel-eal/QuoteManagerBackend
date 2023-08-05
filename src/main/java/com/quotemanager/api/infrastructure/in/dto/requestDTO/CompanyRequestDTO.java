package com.quotemanager.api.infrastructure.in.dto.requestDTO;

import com.quotemanager.api.core.domain.model.enumeration.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyRequestDTO {
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
    private Long ownerId;
}
