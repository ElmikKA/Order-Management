package com.ordermanagement.Order.Management.Repository;

import com.ordermanagement.Order.Management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllOrders();
}

