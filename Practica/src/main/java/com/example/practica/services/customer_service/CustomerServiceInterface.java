package com.example.practica.services.customer_service;

import com.example.practica.models.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    Customer getCustomerById(Long customerId);
    List<Customer> getAllCustomers();
}