package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String mail;
    private String password;
    private List<CompanyResponseDTO> companies;
}
