package com.ordermanagement.Order.Management.Service;

import com.ordermanagement.Order.Management.Repository.OrderRepository;
import com.ordermanagement.Order.Management.entity.Order;
import com.ordermanagement.Order.Management.exception.OrderNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        return orderRepository.findAll();
    }

    @Transactional
    public Order createNewOrder(Order newOrder) {
        log.info("new order to save: [{}]", newOrder);
        // +log data
        // +store into datasource
        // validate fields of newOrder
        // +validate duplicates
        if(orderRepository.isDuplicateOfOther(newOrder)) {
            throw new OrderNotFoundException("Order already exists!!!");
        }
        Order saved = orderRepository.save(newOrder);
        log.info("after saving: [{}]", saved);
        return saved;
    }




}
