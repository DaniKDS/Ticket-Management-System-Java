package com.example.practica.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "CustomerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CustomerId;

    @Column(name = "CustomerName")
    private String CustomerName;

    @Column(name = "email")
    private String email;

    public Customer() {
    }

    public Customer(Long CustomerId, String CustomerName, String email) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.email = email;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{CustomerId=").append(CustomerId);
        sb.append(", CustomerName=").append(CustomerName);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
}
