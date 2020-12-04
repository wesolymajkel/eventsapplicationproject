package eventsapplicationproject.eventsapp.event;

import eventsapplicationproject.eventsapp.place.Place;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="events")
@NoArgsConstructor
@AllArgsConstructor

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Pole nie może być puste")
    private String nameOfEvent;
    @NotEmpty(message = "Pole nie może być puste")
    private Place nameOfPlace;

    @NotEmpty(message = "Pole nie może być puste")
    private String description;

    private EventType type;
    @NotEmpty(message = "Pole nie może być puste")
    private Place address;

    @NotEmpty(message = "Pole nie może być puste")
    private String date;

    @NotEmpty(message = "Pole nie może być puste")
    private String startHour;

    @NotEmpty(message = "Pole nie może być puste")
    private boolean ifTickets;

    private int numberOfTickets;

    private double ticketPrice;

    @NotEmpty(message = "Pole nie może być puste")
    private boolean ifOnlyForAdults;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public Place getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(Place nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public Place getAddress() {
        return address;
    }

    public void setAddress(Place address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public boolean isIfTickets() {
        return ifTickets;
    }

    public void setIfTickets(boolean ifTickets) {
        this.ifTickets = ifTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isIfOnlyForAdults() {
        return ifOnlyForAdults;
    }

    public void setIfOnlyForAdults(boolean ifOnlyForAdults) {
        this.ifOnlyForAdults = ifOnlyForAdults;
    }
}
