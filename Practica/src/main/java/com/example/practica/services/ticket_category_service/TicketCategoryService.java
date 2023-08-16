package com.example.practica.services.ticket_category_service;

import com.example.practica.models.TicketCategory;
import com.example.practica.repositories.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketCategoryService implements TicketCategoryServiceInterface {
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public TicketCategory getTicketCategoryById(Long ticketCategoryId) {
        return this.ticketCategoryRepository.getTicketCategoryByTicketCategoryId(ticketCategoryId);
    }

    @Override
    public List<TicketCategory> getAllTicketCategories() {
        List<TicketCategory> listOfTicketCategories = new ArrayList<>();
        this.ticketCategoryRepository.findAll().forEach(ticketCategory -> listOfTicketCategories.add(ticketCategory));
        return listOfTicketCategories;
    }
}