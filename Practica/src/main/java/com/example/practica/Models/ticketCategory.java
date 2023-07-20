package com.example.practica.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class ticketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @ManyToOne
    private event eventID;
    private String description;
    private int price;

    public ticketCategory() {
    }

    public ticketCategory(Long ticketCategoryID, event eventID, String description, int price) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public event getEventID() {
        return eventID;
    }

    public void setEventID(event eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
