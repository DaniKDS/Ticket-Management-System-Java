package Models;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;

@Entity
@Table(name = "Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventid;
    @ManyToOne
    private Venue venueId;
    @OneToOne
    private EventType eventlypeId;
    private String eventName;
    private String startDate;
    private String endDate;

    public Event() {
    }

public Event(int eventid, Venue venueId, EventType eventlypeId, String eventName, String startDate, String endDate) {
        this.eventid = eventid;
        this.venueId = venueId;
        this.eventlypeId = eventlypeId;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public EventType getEventlypeId() {
        return eventlypeId;
    }

    public void setEventlypeId(EventType eventlypeId) {
        this.eventlypeId = eventlypeId;
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
