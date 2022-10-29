package com.ordermanagement.Order.Management.dto;

import java.math.BigDecimal;

public record ProductDto(

        Long id,

        String name,

        String skuCode,

        BigDecimal unitPrice
) {
}
