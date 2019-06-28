package ProgrammingWithClasses.Block1.Task8;

import java.util.Comparator;

public class CustomerComporatorSurname implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

