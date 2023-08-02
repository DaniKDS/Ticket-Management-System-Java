package com.example.practica.controller;

import com.example.practica.models.TicketCategory;
import com.example.practica.services.ticket_category_service.TicketCategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ticket_category")
public class TicketCategoryController {
    private TicketCategoryServiceInterface ticketCategoryService;

    @Autowired
    public TicketCategoryController(TicketCategoryServiceInterface ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/{ticketCategoryId}")
    public TicketCategory getTicketCategoryById(@PathVariable Long ticketCategoryId) {
        return this.ticketCategoryService.getTicketCategoryById(ticketCategoryId);
    }

    @GetMapping
    public List<TicketCategory> getTicketCategories() {
        return this.ticketCategoryService.getAllTicketCategories();
    }
}
