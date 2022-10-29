package com.ordermanagement.Order.Management.converter;

public interface Converter <E, D> {

    D fromEntityToDto(E entity);

    E fromDtoToEntity(D dto);
}

