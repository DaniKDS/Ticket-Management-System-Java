package com.example.practica.repositories;


import com.example.practica.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findEventByVenueId_VenueIDAndEventType_EventTypeName(Long venueId, String eventType);
}
