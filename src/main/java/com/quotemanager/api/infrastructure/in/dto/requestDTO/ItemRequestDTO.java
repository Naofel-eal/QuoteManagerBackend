package com.quotemanager.api.infrastructure.in.dto.requestDTO;

import com.quotemanager.api.core.domain.model.ItemUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDTO {
    private String name;
    private ItemUnit unit;
    private BigDecimal price;
    private Integer quantity;
}
