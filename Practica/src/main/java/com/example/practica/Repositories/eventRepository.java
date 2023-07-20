package com.example.practica.Repositories;


import com.example.practica.Models.event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface eventRepository extends JpaRepository<event, Long> {
}
