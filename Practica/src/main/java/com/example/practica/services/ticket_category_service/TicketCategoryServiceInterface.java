package com.example.practica.services.ticket_category_service;

import com.example.practica.models.TicketCategory;

import java.util.List;

public interface TicketCategoryServiceInterface {
    TicketCategory getTicketCategoryById(Long id);

    List<TicketCategory> getAllTicketCategories();
}
