package com.example.practica.Services;

import com.example.practica.Models.customer;
import com.example.practica.Repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceCustomer {
    private customerRepository customerRepository;
    @Autowired
    public serviceCustomer(customerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(customer customer) {
        customerRepository.save(customer);
    }

    public customer getCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    public List<customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}


