package com.ordermanagement.Order.Management.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;



@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Data
@Builder
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate dateOfSubmission;

    @OneToOne(cascade = CascadeType.MERGE)
    OrderLine orderLine;

    @OneToOne(cascade = CascadeType.MERGE)
    private Customer customer;




}
