package com.quotemanager.api.infrastructure.out.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private LocalDate date;
    private int periodOfValidity;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyDBO company;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private ClientDBO client;

    @ManyToMany
    @JoinTable
    private List<ItemDBO> items;

    private BigDecimal price;
    private BigDecimal tva;
    private String details;

    @OneToOne
    @JoinColumn(name = "bill_id", nullable = false)
    private BillDBO bill;
}
