package com.quotemanager.api.core.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String mail;
    private String password;
    private List<Company> companies;
}
