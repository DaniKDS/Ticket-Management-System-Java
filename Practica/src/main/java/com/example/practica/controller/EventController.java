package com.example.practica.controller;

import com.example.practica.models.Event;
import com.example.practica.services.event_service.EventService;
import com.example.practica.services.event_service.EventServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private EventServiceInterface eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/events")
    public List<Event> getEventsByVenueAndType(@RequestParam(required = false)  Long venueId,
                                               @RequestParam(required = false) String eventTypeName) {
        if(venueId == null || eventTypeName == null) {
            return this.eventService.getAllEvents();
        }
        return this.eventService.getEventsByVenueAndType(venueId, eventTypeName);
    }
}