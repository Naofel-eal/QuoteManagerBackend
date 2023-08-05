package com.quotemanager.api.infrastructure.in.dto.requestDTO;

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
public class QuoteRequestDTO {
    private String reference;
    private LocalDate date;
    private int periodOfValidity;
    private Company company;
    private Client client;
    private List<ItemRequestDTO> items;
    private BigDecimal price;
    private BigDecimal tva;
    private String details;

}
