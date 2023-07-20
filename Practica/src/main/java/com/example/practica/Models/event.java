package com.example.practica.Models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Event")
public class event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventid;
    @ManyToOne
    private venue venueId;
    @OneToOne
    private eventType eventlypeId;
    private String eventName;
    private String startDate;
    private String endDate;

    public event() {
    }

public event(Long eventid, venue venueId, eventType eventlypeId, String eventName, String startDate, String endDate) {
        this.eventid = eventid;
        this.venueId = venueId;
        this.eventlypeId = eventlypeId;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getEventid() {
        return eventid;
    }

    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    public venue getVenueId() {
        return venueId;
    }

    public void setVenueId(venue venueId) {
        this.venueId = venueId;
    }

    public eventType getEventlypeId() {
        return eventlypeId;
    }

    public void setEventlypeId(eventType eventlypeId) {
        this.eventlypeId = eventlypeId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
