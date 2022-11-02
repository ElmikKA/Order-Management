package com.ordermanagement.Order.Management.Service;

import com.ordermanagement.Order.Management.Repository.RealOrderRepository;
import com.ordermanagement.Order.Management.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    private final RealOrderRepository realOrderRepository;

    public CustomerService(RealOrderRepository realOrderRepository) {
        this.realOrderRepository = realOrderRepository;
    }


    public List<Customer> findAllCustomers() {
        return realOrderRepository.findAllCustomers();
    }
}





