package com.example.practica.models;


import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @Column(name = "OrderID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    @ManyToOne
    @JoinColumn(name = "CustomerID")

    private Customer customerID;
    @Column(name = "ticketCategoryID")

    private Long ticketCategoryID;
    @Column(name = "orderAt")

    private String orderAt;
    @Column(name = "numberOfTickets")
    private int numberOfTickets;
    @Column(name = "totalPrice")
    private int totalPrice;

    public Order() {
    }

    public Order(Long orderID, Customer customerID, Long ticketCategoryID, String orderAt, int numberOfTickets, int totalPrice) {
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

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
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
