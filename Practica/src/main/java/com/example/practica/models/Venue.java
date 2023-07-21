package com.example.practica.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Venue")
public class Venue implements Serializable {

    @Id
    @Column(name = "venueID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueID;
    @Column(name = "location")
    private String location;
    @Column(name = "type")
    private String type;
    @Column(name = "capacity")
    private int capacity;

    public Venue() {
    }

    public Venue(Long venueID, String location, String type, int capacity) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public Long getVenueID() {
        return venueID;
    }

    public void setVenueID(Long venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}
