package com.example.practica.Repositories;


import com.example.practica.Models.ticketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketCategoryRepository extends JpaRepository<ticketCategory, Long> {
}
