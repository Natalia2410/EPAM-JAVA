package ProgrammingWithClasses.Task8;

import java.util.ArrayList;
import java.util.Collections;

public class ListCustomer {
    private ArrayList<Customer> customers;

    public ListCustomer(ArrayList<Customer> list) {

        this.customers = list;
    }

    public ArrayList<Customer> getCustomers() {

        return customers;
    }

    public void sortCustomer() {
        Collections.sort(customers, new CustomerComporatorSurname().thenComparing(new CustomerComparatorName().thenComparing(new CustomerComparatorMiddleName())));
    }

    public void print() {
        for (Customer item : customers) {
            System.out.println(item + " ");
        }
    }

    public void getCustomerByNumberOfCreditCard(int min, int max) {
        int n = customers.size();
        for (int i = 0; i < n; i++) {
            if (customers.get(i).getNumberOfCreditCard() > min && customers.get(i).getNumberOfCreditCard() < max) {
                System.out.println(customers.get(i) + " ");
            }
        }
    }
}


