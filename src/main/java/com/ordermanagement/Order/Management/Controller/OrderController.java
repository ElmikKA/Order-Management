package com.ordermanagement.Order.Management.Controller;

import com.ordermanagement.Order.Management.Service.OrderService;
import com.ordermanagement.Order.Management.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> findAllOrders() {
        return this.orderService.findAllOrders();
    }
}
