package com.ordermanagement.Order.Management.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private Long registrationCode;

    private String fullName;

    private String email;

    private Long telephone;

    public Customer(Long id, Long registrationCode, String fullName, String email, Long telephone) {
        this.id = id;
        this.registrationCode = registrationCode;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(Long registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
}
