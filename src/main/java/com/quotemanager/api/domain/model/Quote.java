package com.quotemanager.api.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Quote {

    private Long id;
    private String reference;
    private LocalDate date;
    private int periodOfValidity;
    private Company company;
    private Client client;
    private List<Item> items;
    private BigDecimal price;
    private BigDecimal tva;
    private String details;
    private Bill bill;
}
