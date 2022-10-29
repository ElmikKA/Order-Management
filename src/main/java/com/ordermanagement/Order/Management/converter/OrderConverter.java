package com.ordermanagement.Order.Management.converter;

import com.ordermanagement.Order.Management.dto.OrderDto;
import com.ordermanagement.Order.Management.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter implements Converter<Order, OrderDto>{

    private final OrderLineConverter orderLineConverter;
    private final CustomerConverter customerConverter;

    public OrderConverter(OrderLineConverter orderLineConverter, CustomerConverter customerConverter) {
        this.orderLineConverter = orderLineConverter;
        this.customerConverter = customerConverter;
    }

    @Override
    public OrderDto fromEntityToDto(Order order) {
        var orderLineDto = orderLineConverter.fromEntityToDto(order.getOrderLine());
        var customerDto = customerConverter.fromEntityToDto(order.getCustomer());
        return OrderDto.builder()
                .dateOfSubmission(order.getDateOfSubmission())
                .orderLine(orderLineDto)
                .customer(customerDto)
                .build();
    }

    @Override
    public Order fromDtoToEntity(OrderDto orderDto) {
        var orderLineEntity = orderLineConverter.fromDtoToEntity(orderDto.orderLine());
        var customerEntity = customerConverter.fromDtoToEntity(orderDto.customer());
        return Order.builder()
                .dateOfSubmission(orderDto.dateOfSubmission())
                .orderLine(orderLineEntity)
                .customer(customerEntity)
                .build();
    }
}
