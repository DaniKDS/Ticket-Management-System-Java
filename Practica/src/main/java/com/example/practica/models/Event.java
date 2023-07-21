package com.example.practica.models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Event")
public class Event implements Serializable {
    @Id
    @Column(name = "eventiD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventid;
    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venueId;
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @Column(name = "eventName")
    private String eventName;
    @Column(name = "startDate")
    private String startDate;
    @Column(name = "endDate")
    private String endDate;
    public Event() {
    }

public Event(Long eventid, Venue venueId, EventType eventlypeId, String eventName, String startDate, String endDate) {
        this.eventid = eventid;
        this.venueId = venueId;
        this.eventType = eventlypeId;
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

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventlypeId) {
        this.eventType = eventlypeId;
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
