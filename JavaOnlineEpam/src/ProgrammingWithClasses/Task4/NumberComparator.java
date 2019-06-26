package ProgrammingWithClasses.Task4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        return o1.getNumber() - o2.getNumber();
    }
}
