package com.quotemanager.api.model;

import com.quotemanager.api.enumeration.CompanyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String tel;
    private String mail;
    private CompanyStatus status;
    private String SIREN;
    private String SIRET;
    private String RNE;
    private String TVA_number;
    private float capital;
    private String logo;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Quote> quotes;
}
