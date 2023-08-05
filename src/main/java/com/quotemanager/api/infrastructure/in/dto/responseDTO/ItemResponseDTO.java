package com.quotemanager.api.infrastructure.in.dto.responseDTO;

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
public class ItemResponseDTO {
    private Long id;
    private String name;
    private ItemUnit unit;
    private BigDecimal price;
    private Integer quantity;
    private Long quoteId;
}
