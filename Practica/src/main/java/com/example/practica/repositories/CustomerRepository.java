package com.example.practica.repositories;

import com.example.practica.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer getCustomerByCustomerId(Long customerId);
}
