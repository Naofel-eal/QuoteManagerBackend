package com.quotemanager.api.infrastructure.out.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "unit", nullable = true)
    private ItemUnitDBO unit;

    private BigDecimal price;
    private Integer quantity;

    @ManyToMany
    private List<QuoteDBO> quotes;
}
