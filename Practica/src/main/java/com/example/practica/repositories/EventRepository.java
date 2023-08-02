package com.example.practica.repositories;

import com.example.practica.models.Customer;
import com.example.practica.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    public List<Event> findEventsByVenueVenueIdAndEventTypeEventTypeName(Long venueId, String eventTypeName);
}