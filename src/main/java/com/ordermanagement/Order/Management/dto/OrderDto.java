package com.ordermanagement.Order.Management.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record OrderDto(

        LocalDate dateOfSubmission,

        OrderLineDto orderLine,

        CustomerDto customer



) {
}
