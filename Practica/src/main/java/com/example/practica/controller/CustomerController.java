package com.example.practica.controller;

import com.example.practica.models.Customer;
import com.example.practica.services.customer_service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/api/v1")
    public class CustomerController {

        @Autowired
        private CustomerService customerService;
        @GetMapping("/customers")
        public List<Customer> getALlCustomers(){
            return customerService.getAllCustomers();
        }
    }

