package com.quotemanager.api.model;

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
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private LocalDate date;
    private int periodOfValidity;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy="quote", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuoteItem> quoteItems;

    private BigDecimal price;
    private BigDecimal tva;
    private String details;

    @OneToOne
    @JoinColumn(name = "bill_id", nullable = false)
    private Bill bill;
}
