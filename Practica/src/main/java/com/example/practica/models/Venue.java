package com.example.practica.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="venue")
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueId;

    @Column(name="venue_location")
    private String venueLocation;

    @Column(name="venue_type")
    private String venueType;

    @Column(name="capacity")
    private int capacity;

    public Venue() {
    }

    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", venueLocation='" + venueLocation + '\'' +
                ", venueType='" + venueType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
