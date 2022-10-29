package com.ordermanagement.Order.Management.entity;

import antlr.build.ANTLR;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate dateOfSubmission;

    @OneToOne
    private OrderLine orderLine;

    @OneToOne
    private Customer customer;

    public Order(Long id, LocalDate dateOfSubmission, OrderLine orderLine, Customer customer) {
        this.id = id;
        this.dateOfSubmission = dateOfSubmission;
        this.orderLine = orderLine;
        this.customer = customer;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(LocalDate dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
