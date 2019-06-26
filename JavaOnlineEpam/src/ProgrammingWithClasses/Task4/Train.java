package ProgrammingWithClasses.Task4;

import ProgrammingWithClasses.Task2.Test2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Train {
    private String town;
    private int number;
    private Calendar departureTime;

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public int getNumber() {
        return number;
    }

    public String getTown() {
        return town;
    }

    public Train(String town, int number) {
        this.town = town;
        this.number = number;
    }

    public void setDepartureTime() {
        Random random = new Random();
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, random.nextInt(23));
        calendar.set(Calendar.MINUTE, random.nextInt(59));
        departureTime = calendar;
    }

    public void print() {
        System.out.println("Train " + number + " to " + town + " " + departureTime.get(Calendar.HOUR) + ":" + departureTime.get(Calendar.MINUTE));
    }

    public boolean isExists(int number) {
        boolean isExists = true;
        if (this.number != number) {
            isExists = false;
        }
        return isExists;
    }

    public void printTrain(int number) {
        System.out.println("Train " + number + " to " + town + " " + departureTime.get(Calendar.HOUR) + ":" + departureTime.get(Calendar.MINUTE));
    }
}
