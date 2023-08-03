package com.quotemanager.api.domain.model;

import java.util.List;

public class User {
    private Long id;
    private String firstname;
    private String name;
    private String mail;
    private String password;
    private List<Company> companies;
}
