package com.example.practica.services;

import com.example.practica.models.Customer;
import com.example.practica.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCustomer {
    private CustomerRepository customerRepository;
    @Autowired
    public ServiceCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}


