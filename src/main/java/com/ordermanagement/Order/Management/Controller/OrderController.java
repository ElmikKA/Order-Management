package com.ordermanagement.Order.Management.Controller;

import com.ordermanagement.Order.Management.Service.CustomerService;
import com.ordermanagement.Order.Management.Service.OrderService;
import com.ordermanagement.Order.Management.converter.CustomerConverter;
import com.ordermanagement.Order.Management.converter.OrderConverter;
import com.ordermanagement.Order.Management.dto.CustomerDto;
import com.ordermanagement.Order.Management.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;

    private final OrderConverter orderConverter;
    private final CustomerConverter customerConverter;


    public OrderController(OrderService orderService, CustomerService customerService, OrderConverter orderConverter, CustomerConverter customerConverter) {
        this.orderService = orderService;
        this.customerService = customerService;
        this.orderConverter = orderConverter;
        this.customerConverter = customerConverter;
    }

    @GetMapping
    public List<OrderDto> findAllOrders() {
        var entities = orderService.findAllOrders();
        return entities.stream()
                .map(order -> orderConverter.fromEntityToDto(order))
                .toList();
    }

    @GetMapping("/customer")
    public List<CustomerDto> findAllCustomers(){
        var entities = customerService.findAllCustomers();
        return entities.stream()
                .map(customerConverter::fromEntityToDto)
                .toList();
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public OrderDto createNewTrip(@Valid @RequestBody OrderDto newOrder) {
        log.info("Trying to create new order: [{}]", newOrder);
        //convert dto to entity
        var toSaveEntity = orderConverter.fromDtoToEntity(newOrder);

        var saved = orderService.createNewOrder(toSaveEntity);

        return orderConverter.fromEntityToDto(saved);
    }
}
