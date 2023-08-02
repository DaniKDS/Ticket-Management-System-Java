package com.example.practica.services.event_service;

import com.example.practica.models.Event;

import java.util.List;

public interface EventServiceInterface {
    List<Event> getAllEvents();
    List<Event> getEventsByVenueAndType(Long venueId, String eventTypeName);
}