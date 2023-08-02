package com.example.practica.services.customer_service;

import com.example.practica.models.Customer;
import com.example.practica.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> listOfCustomers = new ArrayList<>();
        this.customerRepository.findAll().forEach(customer -> listOfCustomers.add(customer));
        return listOfCustomers;
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return this.customerRepository.getCustomerByCustomerId(customerId);
    }
}