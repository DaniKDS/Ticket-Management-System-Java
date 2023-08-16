package com.example.practica.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="ticket_category")
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketCategoryId;

    @Column(name = "ticket_category_description")
    private String ticketCategoryDescription;

    @Column(name = "price")
    private Float price;

    @JsonIgnoreProperties("ticketCategory")
    @ManyToOne()
    @JoinColumn(name="event_id")
    private Event eventId;

    public TicketCategory() {
    }

    public Long getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Long ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getTicketCategoryDescription() {
        return ticketCategoryDescription;
    }

    public void setTicketCategoryDescription(String ticketCategoryDescription) {
        this.ticketCategoryDescription = ticketCategoryDescription;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Event getEventId() {
        return eventId;
    }

    public void setEventId(Event event) {
        this.eventId = event;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryId=" + ticketCategoryId +
                ", ticketCategoryDescription='" + ticketCategoryDescription + '\'' +
                ", price=" + price +
                ", eventId=" + eventId +
                '}';
    }
}
