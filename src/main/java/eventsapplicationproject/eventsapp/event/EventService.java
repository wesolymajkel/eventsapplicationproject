package eventsapplicationproject.eventsapp.event;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class EventService {
    public final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvent() {
        return eventRepository.findAll();
    }
    public Event getEvent(long id) {
        Optional<Event> byId = eventRepository.findById(id);
        return byId.orElse(null);
    }
    public void addEvent(Event event) {
        eventRepository.save(event);
    }
    public void deleteEvent(long id) {
        eventRepository.deleteById(id);
    }
    public void updateEvent(Event event) {
        eventRepository.save(event);
    }
}

