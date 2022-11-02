package com.ordermanagement.Order.Management.Repository;


import com.ordermanagement.Order.Management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;




@NoRepositoryBean
public interface OrderRepository extends JpaRepository<Order, Long> {



    default boolean isDuplicateOfOther(Order Order){
        return false;
    }
}

