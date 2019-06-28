package ProgrammingWithClasses.Block1.Task10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Airline> list = new ArrayList<>();
        Random random = new Random();
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        calendar1.set(Calendar.MINUTE, random.nextInt(60));

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        calendar2.set(Calendar.MINUTE, random.nextInt(60));

        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        calendar3.set(Calendar.MINUTE, random.nextInt(60));

        Calendar calendar4 = new GregorianCalendar();
        calendar4.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        calendar4.set(Calendar.MINUTE, random.nextInt(60));

        Calendar calendar5 = new GregorianCalendar();
        calendar5.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        calendar5.set(Calendar.MINUTE, random.nextInt(60));

        String[] weekdays1 = {"Monday", "Tuesday", "Wednesday"};
        String[] weekdays2 = {"Monday", "Wednesday", "Sunday"};
        String[] weekdays3 = {"Monday"};
        String[] weekdays4 = {"Friday", "Saturday"};
        String[] weekdays5 = {"Saturday", "Sunday"};

        list.add(new Airline("Moskow", 12, "Sukhoi SuperJet-100", calendar1.get(Calendar.HOUR) + ":" + calendar1.get(Calendar.MINUTE), weekdays1));
        list.add(new Airline("Prague", 45, "Airbus A320", calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE), weekdays2));
        list.add(new Airline("Moskow", 47, "Sukhoi SuperJet-100", calendar3.get(Calendar.HOUR) + ":" + calendar3.get(Calendar.MINUTE), weekdays3));
        list.add(new Airline("Minsk", 77, "Boeing-737", calendar4.get(Calendar.HOUR) + ":" + calendar4.get(Calendar.MINUTE), weekdays4));
        list.add(new Airline("Kiev", 54, "Boeing-747", calendar5.get(Calendar.HOUR) + ":" + calendar5.get(Calendar.MINUTE), weekdays5));

        ListAirline aitlines = new ListAirline(list);

        System.out.println("list of all flights:");
        aitlines.print();

        System.out.println("\nlist of flights for a given destination:");
        String destination = "Moskow";
        aitlines.getFlightsForGivenDestination(destination);

        System.out.println("\nlist of flights for a given day of the week");
        String dayOfWeek = "Tuesday";
        ArrayList<Airline> listAirline = aitlines.getFlightsForDayOfWeek(dayOfWeek);
        for (Airline item : listAirline) {
            System.out.println(item + " ");
        }

        String time = "10:12";
        System.out.println("\nlist of flights for a given day of the week and time greater than the specified:");
        ListAirline.getFlightsForDayOfWeekAndTimeOfDeparture(aitlines, dayOfWeek, time);
    }
}
