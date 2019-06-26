package ProgrammingWithClasses.Task4;

import java.util.Calendar;
import java.util.Comparator;

public class DepartureTimeComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        if (o1.getDepartureTime().get(Calendar.HOUR) > o2.getDepartureTime().get(Calendar.HOUR)) {
            return 1;
        } else if (o1.getDepartureTime().get(Calendar.HOUR) == o2.getDepartureTime().get(Calendar.HOUR)) {
            if (o1.getDepartureTime().get(Calendar.MINUTE) > o2.getDepartureTime().get(Calendar.MINUTE)) {
                return 1;
            } else if (o1.getDepartureTime().get(Calendar.MINUTE) > o2.getDepartureTime().get(Calendar.MINUTE)) {
                return 0;
            } else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}
