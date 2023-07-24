package com.example.practica.repositories;


import com.example.practica.models.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType, Long>{
}
