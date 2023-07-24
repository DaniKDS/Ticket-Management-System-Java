package com.example.practica.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {

    @Id
    @Column(name = "ticketCategoryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event eventID;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;

    public TicketCategory() {
    }

    public TicketCategory(Long ticketCategoryID, Event eventID, String description, int price) {
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

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
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
