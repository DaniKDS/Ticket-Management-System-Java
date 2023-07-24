package com.example.practica.services;

import com.example.practica.models.Event;
import com.example.practica.models.TicketCategory;
import com.example.practica.models.Venue;
import com.example.practica.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceEvent {

    private EventRepository eventRepository;

    @Autowired
    public ServiceEvent(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
    public List<Event> getEventsByVenueAndType(Long venueId, String eventName) {
        return eventRepository.findEventByVenueId_VenueIDAndEventType_EventTypeName(venueId, eventName);

    }

}
