package com.example.practica.services.event_service;

import com.example.practica.models.Event;
import com.example.practica.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements EventServiceInterface {
    private EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> listOfEvents = new ArrayList<>();
        this.eventRepository.findAll().forEach(event -> listOfEvents.add(event));
        return listOfEvents;
    }

    @Override
    public List<Event> getEventsByVenueAndType(Long venueId, String eventTypeName) {
        List<Event> listOfEvents = new ArrayList<>();
        this.eventRepository.findEventsByVenueVenueIdAndEventTypeEventTypeName(venueId, eventTypeName).forEach(event -> listOfEvents.add(event));
        return listOfEvents;
    }


}