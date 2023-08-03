package com.quotemanager.api.domain.model;

import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String mail;
    private String tel;
    private String address;
    private String details;
    private Company company;
    private List<Quote> quotes;
}
