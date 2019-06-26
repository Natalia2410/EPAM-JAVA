package ProgrammingWithClasses.Task4;

import java.util.Comparator;

public class TownComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTown().compareTo(o2.getTown());
    }
}
