package com.example.practica.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="event_type")
public class EventType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventTypeId;

    @Column(name = "event_type_name")
    private String eventTypeName;

    public EventType() {
    }

    public Long getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeId=" + eventTypeId +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }
}
