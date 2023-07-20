package com.example.practica.Repositories;


import com.example.practica.Models.venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface venueRepository extends JpaRepository<venue, Long> {
}
