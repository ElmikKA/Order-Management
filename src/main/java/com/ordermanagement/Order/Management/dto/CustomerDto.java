package com.ordermanagement.Order.Management.dto;

public record CustomerDto(
        Long id,

        Long registrationNumber,

        String fullName,

        String email,

        Long telephone
) {
}
