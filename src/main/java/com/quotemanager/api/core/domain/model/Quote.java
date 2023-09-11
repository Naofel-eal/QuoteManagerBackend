package com.quotemanager.api.core.domain.model;

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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(int periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
