package com.example.practica.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {

    @Id
    @Column(name = "eventTypeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventTypeID;
    @Column(name = "eventTypeName")
    private String eventTypeName;

    public EventType() {
    }

    public EventType(Long eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }

    public Long getEventTypeId() {
        return eventTypeID;
    }

    public void setEventTypeId(Long eventTypeId) {
        this.eventTypeID = eventTypeId;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }


}
