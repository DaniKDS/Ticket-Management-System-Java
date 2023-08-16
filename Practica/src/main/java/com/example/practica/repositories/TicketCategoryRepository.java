package com.example.practica.repositories;

import com.example.practica.models.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Long> {
    TicketCategory getTicketCategoryByTicketCategoryId(Long ticketCategoryId);
}