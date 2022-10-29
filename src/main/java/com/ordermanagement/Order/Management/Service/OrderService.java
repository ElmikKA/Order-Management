package com.ordermanagement.Order.Management.Service;

import com.ordermanagement.Order.Management.Repository.OrderRepository;
import com.ordermanagement.Order.Management.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAllOrders() {
        log.info("finding all orders");
        return orderRepository.findAllOrders();
    }




}
