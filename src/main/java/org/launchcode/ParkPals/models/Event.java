package org.launchcode.ParkPals.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Event extends AbstractEntity {

    @NotNull
    private String name;

    @NotNull
    @ManyToOne
    private User creator;

    @ManyToOne
    private Park park;

    @NotNull
    private Date date;

    @NotNull
    private DogActivity desiredActivity;

    @NotNull
    private DogTemperament desiredTemperament;

    @ElementCollection
    private List<User> attendees = new ArrayList<>();

    public Event(String name, Park park, Date date, DogActivity desiredActivity, DogTemperament desiredTemperament, List<User> attendees) {
        this.name = name;
        this.park = park;
        this.date = date;
        this.desiredActivity = desiredActivity;
        this.desiredTemperament = desiredTemperament;
        this.attendees = attendees;
    }

    public Event() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DogActivity getDesiredActivity() {
        return desiredActivity;
    }

    public void setDesiredActivity(DogActivity desiredActivity) {
        this.desiredActivity = desiredActivity;
    }

    public DogTemperament getDesiredTemperament() {
        return desiredTemperament;
    }

    public void setDesiredTemperament(DogTemperament desiredTemperament) {
        this.desiredTemperament = desiredTemperament;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public void addAttendees(User user) {
        this.attendees.add(user);
    }
}