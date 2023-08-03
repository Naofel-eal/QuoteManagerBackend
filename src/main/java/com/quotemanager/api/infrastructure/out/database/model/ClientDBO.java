package com.quotemanager.api.infrastructure.out.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String mail;
    private String tel;
    private String address;
    private String details;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyDBO company;

    @OneToMany(mappedBy="client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuoteDBO> quotes;
}
