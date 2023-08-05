package com.quotemanager.api.infrastructure.in.dto.responseDTO;

import com.quotemanager.api.core.domain.model.Client;
import com.quotemanager.api.core.domain.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuoteResponseDTO {
    private Long id;
    private String reference;
    private LocalDate date;
    private int periodOfValidity;
    private Company company;
    private Client client;
    private List<ItemResponseDTO> items;
    private BigDecimal price;
    private BigDecimal tva;
    private String details;
    private Long billId;
}
