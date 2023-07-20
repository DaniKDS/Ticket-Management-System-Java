package com.example.practica.Repositories;


import com.example.practica.Models.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ordersRepository extends JpaRepository<order, Long> {
}
