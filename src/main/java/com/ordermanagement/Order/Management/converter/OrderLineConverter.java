package com.ordermanagement.Order.Management.converter;

import com.ordermanagement.Order.Management.dto.OrderLineDto;
import com.ordermanagement.Order.Management.entity.OrderLine;
import org.springframework.stereotype.Component;

@Component
public class OrderLineConverter implements Converter<OrderLine, OrderLineDto> {

    private final ProductConverter productConverter;

    public OrderLineConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    @Override
    public OrderLineDto fromEntityToDto(OrderLine entity) {
        var productDto = entity.getProduct()
                .stream()
                .map(productConverter::fromEntityToDto)
                .toList();

        return new OrderLineDto(entity.getId(), productDto, entity.getQuantity());
    }

    @Override
    public OrderLine fromDtoToEntity(OrderLineDto dto) {
        var entities = dto.product()
                .stream()
                .map(productConverter::fromDtoToEntity)
                .toList();

        return new OrderLine(dto.id(), entities, dto.quantity());
    }
}
