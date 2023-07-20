package com.example.practica.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    @ManyToOne
    @JoinColumn(name = "CustomerID")

    private customer customerID;
    private Long ticketCategoryID;
    private String orderAt;
    private int numberOfTickets;
    private int totalPrice;

    public order() {
    }

    public order(Long orderID, customer customerID, Long ticketCategoryID, String orderAt, int numberOfTickets, int totalPrice) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        this.orderAt = orderAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(customer customerID) {
        this.customerID = customerID;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public String getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(String orderAt) {
        this.orderAt = orderAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
