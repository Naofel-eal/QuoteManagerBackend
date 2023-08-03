package com.quotemanager.api.domain.model;

import java.math.BigDecimal;

public class Item {
    private Long id;
    private String name;
    private ItemUnit unit;
    private BigDecimal price;
    private Integer quantity;
    private Quote quote;
}
