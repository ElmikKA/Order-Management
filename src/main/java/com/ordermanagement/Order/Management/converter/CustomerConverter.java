package com.ordermanagement.Order.Management.converter;

import com.ordermanagement.Order.Management.dto.CustomerDto;
import com.ordermanagement.Order.Management.entity.Customer;
import org.springframework.stereotype.Component;



@Component
public class CustomerConverter implements Converter<Customer, CustomerDto> {
    @Override
    public CustomerDto fromEntityToDto(Customer entity) {
        return new CustomerDto(entity.getId(),
                entity.getRegistrationCode(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getTelephone());
    }

    @Override
    public Customer fromDtoToEntity(CustomerDto dto) {
        return new Customer(dto.id(),
                dto.registrationNumber(),
                dto.fullName(),
                dto.email(),
                dto.telephone());
    }
}
