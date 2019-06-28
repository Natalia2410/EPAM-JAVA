package ProgrammingWithClasses.Block2.Task2;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 15;
        int max = 25;
        int diff = max - min;

        Engine engineSedan = new Engine(1600);
        Engine engineWagon = new Engine(2000);
        int n = 4;
        Wheel[] wheelsSedan = new Wheel[n];
        for (int j = 0; j < n; j++) {
            int i = random.nextInt(diff + 1);
            i += min;
            wheelsSedan[j] = new Wheel(i, random.nextInt(360));
        }
        Wheel[] wheelsWagon = new Wheel[n];
        for (int j = 0; j < n; j++) {
            int i = random.nextInt(diff + 1);
            i += min;
            wheelsWagon[j] = new Wheel(i, random.nextInt(360));
        }

        Sedan sedan = new Sedan("Opel", "Black", 260, 800000, wheelsSedan, engineSedan, random.nextInt(50));
        Wagon wagon = new Wagon("BMW", "White", 300, 2500000, wheelsWagon, engineWagon, random.nextInt(50));
        System.out.println("model:");
        sedan.printModel();
        wagon.printModel();

        sedan.gas();
        wagon.gas();
        System.out.println("\namount of gasoline from sedan before fill: " + sedan.getAmountOfGasoline());
        if (sedan.getAmountOfGasoline() < 10) {
            sedan.fill();
            System.out.println("\namount of gasoline from sedan after fill: " + sedan.fill());
        }

        System.out.println("\namount of gasoline from wagon before fill: " + wagon.getAmountOfGasoline());
        if (wagon.getAmountOfGasoline() < 20) {
            wagon.fill();
            System.out.println("\namount of gasoline from wagon after fill: " + wagon.fill());
        }
        System.out.println(sedan);
        sedan.changeWheel();
        System.out.println(sedan);
        System.out.println("");
        System.out.println(wagon);
        wagon.changeWheel();
        System.out.println(wagon);
    }
}
