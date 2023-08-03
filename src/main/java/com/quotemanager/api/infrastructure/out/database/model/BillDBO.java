package com.quotemanager.api.infrastructure.out.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @OneToOne
    @JoinColumn(name = "quote_id", nullable = false)
    private QuoteDBO quote;
}
