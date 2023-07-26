package com.quotemanager.api.model;

import com.quotemanager.api.enumeration.ItemUnit;
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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private ItemUnit unit;
    private BigDecimal price;

    @OneToMany(mappedBy="item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuoteItem> quoteItem;
}
