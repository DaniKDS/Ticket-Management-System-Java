package com.example.practica.controller;

import com.example.practica.models.Event;
import com.example.practica.services.ServiceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/api/v1")
    public class EventController {
        private ServiceEvent eventService ;
        @Autowired
        public EventController(ServiceEvent eventService) {
            this.eventService = eventService;
        }

        @GetMapping("/events")
        public List<Event> getEvents(@RequestParam("venueId") Long venueId,
                                     @RequestParam("eventType") String eventName) {
            return eventService.getEventsByVenueAndType(venueId, eventName);
        }

    }