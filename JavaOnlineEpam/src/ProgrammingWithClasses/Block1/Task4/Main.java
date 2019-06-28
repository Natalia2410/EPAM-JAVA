package ProgrammingWithClasses.Block1.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Train> list = new ArrayList<>();
        Train train1 = new Train("Moscow", 14);
        train1.setDepartureTime();
        Train train2 = new Train("Abu Daby", 22);
        train2.setDepartureTime();
        Train train3 = new Train("Minsk", 37);
        train3.setDepartureTime();
        Train train4 = new Train("Minsk", 41);
        train4.setDepartureTime();
        Train train5 = new Train("Prague", 5);
        train5.setDepartureTime();

        list.add(train1);
        list.add(train2);
        list.add(train3);
        list.add(train4);
        list.add(train5);

        System.out.println("Before sorting: ");
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.get(i).print();
        }
        Collections.sort(list, new NumberComparator());
        System.out.println("After sorting by train number : ");
        for (int i = 0; i < n; i++) {
            list.get(i).print();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        boolean isExists = true;
        for (int i = 0; i < n; i++) {
            if (list.get(i).isExists(number)) {
                list.get(i).printTrain(number);
                isExists = true;
                break;
            } else {
                isExists = false;
            }
        }
        if (!isExists) {
            System.out.println("There is no train with this number");
        }

        Collections.sort(list, new TownComparator().thenComparing(new DepartureTimeComparator()));
        System.out.println("sorting of destination and departure time: \n");

        for (int i = 0; i < n; i++) {
            list.get(i).print();
        }
    }
}
