package ProgrammingWithClasses.Task8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Petrov", "Petr", "Petrovich", "Dzerzhinskogo", 65, 12345678));
        list.add(new Customer(2, "Ivanov", "Dmitry", "Ivanovich", "Baumana", 34, 64537829));
        list.add(new Customer(3, "Ivanov", "Dmitry", "Alexandrovich", "Lopatina", 43, 76549382));
        list.add(new Customer(4, "Malisheva", "Tatyana", "Petrovna", "Lenina", 54, 76543345));
        list.add(new Customer(5, "Kirillova", "Natalia", "Sergeevna", "Paskalya", 67, 87463555));
        ListCustomer customers = new ListCustomer(list);
        System.out.println("Before sotring: ");
        customers.print();
        customers.sortCustomer();
        System.out.println("\nAfter sorting: ");
        customers.print();
        System.out.println("\nCustomers who have a credit card number in the specified range: ");
        customers.getCustomerByNumberOfCreditCard(30, 40);
    }
}
