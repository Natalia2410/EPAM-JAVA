package ProgrammingWithClasses.Task10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String timeOfDeparture;
    private String[] weekdays;

    public Airline(String destination, int flightNumber, String aircraftType, String timeOfDeparture, String[] weekdays) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.timeOfDeparture = timeOfDeparture;
        this.weekdays = weekdays;
    }

    @Override
    public String toString() {
        return "Airline{"
                + "destination = " + destination
                + ", flightNumber = " + flightNumber
                + ", aircraftType = " + aircraftType
                + ", timeOfDeparture = " + timeOfDeparture
                + ", weekdays = " + toStringArray(weekdays)
                + '}';
    }

    public String toStringArray(String[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + " ";
        }
        return str;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String[] getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String[] weekdays) {
        this.weekdays = weekdays;
    }
}
