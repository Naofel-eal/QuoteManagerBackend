package com.quotemanager.api.core.domain.model;

import com.quotemanager.api.core.domain.model.enumeration.CompanyStatus;

import java.util.List;

public class Company {
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
    private float capital;
    private User owner;
    private List<Client> clients;
    private List<Quote> quotes;

    public void addClient(Client client) {
        clients.add(client);
    }
    public void removeClient(Client client) { clients.remove(client); }
    public List<Client> getClients() { return this.clients;}

    public Long getId() {
        return id;
    }
}
