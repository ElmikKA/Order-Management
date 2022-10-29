package com.ordermanagement.Order.Management.dto;

import java.util.List;

public record OrderLineDto(

        Long id,

        List<ProductDto> product,

        Long quantity
) {
}
