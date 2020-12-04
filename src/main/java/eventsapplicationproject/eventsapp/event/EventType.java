package eventsapplicationproject.eventsapp.event;

import javax.persistence.Table;

@Table(name = "events_types")
public enum EventType {
    teatr, opera, balet, film, koncert, sport, klub, wystawa, edukacja
}
