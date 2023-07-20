package com.example.practica.Repositories;

import com.example.practica.Models.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends JpaRepository<customer, Long> {

}

