package com.ordermanagement.Order.Management.dto;

import lombok.Builder;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import javax.validation.Valid;

@Builder
public record OrderDto(

        @Future
        LocalDate dateOfSubmission,

        @NotNull
        OrderLineDto orderLine,

        @Valid
        @NotNull
        CustomerDto customer



) {
}
