package com.ordermanagement.Order.Management.Repository;

import com.ordermanagement.Order.Management.entity.Customer;
import com.ordermanagement.Order.Management.entity.Order;
import org.springframework.context.annotation.Profile;

import java.util.List;


@Profile("!develop")
public interface RealOrderRepository extends OrderRepository {

    List<Customer> findAllCustomers();
    default boolean isDuplicateOfOther(Order Order){
        return false;
    }
}
