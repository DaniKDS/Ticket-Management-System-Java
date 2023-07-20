package com.example.practica.Controller;

import com.example.practica.Models.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.practica.Services.serviceCustomer;

    @RestController
    @RequestMapping("/api/v1")
    public class customerController {

        @Autowired
        private serviceCustomer customerService;
        @GetMapping("/customers")
        public List<customer> getALlCustomers(){
            return customerService.getAllCustomers();
        }
    }

