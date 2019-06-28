package ProgrammingWithClasses.Block1.Task10;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListAirline {
    private ArrayList<Airline> airlines;

    public ListAirline(ArrayList<Airline> list) {
        this.airlines = list;
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public void print() {
        for (Airline item : airlines) {
            System.out.println(item + " ");
        }
    }

    public void getFlightsForGivenDestination(String destination) {
        int n = airlines.size();
        boolean isContains = false;
        for (int i = 0; i < n; i++) {
            if (airlines.get(i).getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airlines.get(i) + " ");
                isContains = true;
            }
        }
        if (!isContains) {
            System.out.println("no such destination");
        }
    }

    public ArrayList<Airline> getFlightsForDayOfWeek(String dayOfWeek) {
        ArrayList<Airline> listAirline = new ArrayList<>();
        if (dayOfWeek.equalsIgnoreCase("Monday")
                || dayOfWeek.equalsIgnoreCase("Tuesday")
                || dayOfWeek.equalsIgnoreCase("Wednesday")
                || dayOfWeek.equalsIgnoreCase("Thursday")
                || dayOfWeek.equalsIgnoreCase("Friday")
                || dayOfWeek.equalsIgnoreCase("Saturday")
                || dayOfWeek.equalsIgnoreCase("Sunday")) {
            int n = airlines.size();
            boolean isContains = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < airlines.get(i).getWeekdays().length; j++) {
                    if (airlines.get(i).getWeekdays()[j].equals(dayOfWeek)) {
                        listAirline.add(airlines.get(i));
                        isContains = true;
                    }
                }
            }
            if (!isContains) {
                System.out.println("no departures on a given day");
            }
        } else {
            System.out.println("this day of the week does not exist");
        }
        return listAirline;
    }

    public static void getFlightsForDayOfWeekAndTimeOfDeparture(ListAirline listAirline, String dayOfWeek, String timeOfDeparture) {
        ArrayList<Airline> listAirlines = listAirline.getFlightsForDayOfWeek(dayOfWeek);
        int n = listAirlines.size();
        int hour = Integer.parseInt(timeOfDeparture.substring(0, 2));
        int minute = Integer.parseInt(timeOfDeparture.substring(3, 5));
        boolean isContains = false;

        for (int i = 0; i < n; i++) {
            String s = listAirlines.get(i).getTimeOfDeparture();
            Pattern pattern = Pattern.compile("\\d+\\:");
            Matcher matcher = pattern.matcher(s);
            String hours = "";
            int num = 0;
            if (matcher.find()) {
                hours = matcher.group();
                num = Integer.parseInt(hours.substring(0, hours.length() - 1));
            }
            Pattern pattern1 = Pattern.compile("\\:\\d+");
            Matcher matcher1 = pattern1.matcher(s);
            String minutes = "";
            int num1 = 0;
            if (matcher1.find()) {
                minutes = matcher1.group();
                num1 = Integer.parseInt(minutes.substring(1, minutes.length()));
            }

            if (num > hour) {
                System.out.println(listAirlines.get(i) + " ");
                isContains = true;
            } else if (num == hour) {
                if (num1 > minute) {
                    System.out.println(listAirlines.get(i) + " ");
                    isContains = true;
                }
            }
        }
        if (!isContains) {
            System.out.println("no flights later " + timeOfDeparture);
        }
    }
}
