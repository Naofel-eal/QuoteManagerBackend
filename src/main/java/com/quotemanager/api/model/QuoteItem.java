package com.quotemanager.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quote_id")
    private Quote quote;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer quantity;
}
