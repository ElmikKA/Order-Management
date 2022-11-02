package com.ordermanagement.Order.Management.dto;

import javax.validation.constraints.NotNull;

public record CustomerDto(
        Long id,

        @NotNull
        Integer registrationNumber,

        @NotNull
        String fullName,

        @NotNull
        String email,

        @NotNull
        String telephone
) {
}
