package ProgrammingWithClasses.Task8;

import java.util.Comparator;

public class CustomerComparatorMiddleName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getMiddleName().compareTo(o2.getMiddleName());
    }
}
