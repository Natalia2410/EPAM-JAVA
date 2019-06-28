package ProgrammingWithClasses.Block2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Wagon extends Car {

    public Wagon(String model, String color, int maxSpeed, int price, Wheel[] wheels, Engine engine, int amountOfGasoline) {
        super(model, color, maxSpeed, price, wheels, engine, amountOfGasoline);
    }

    @Override
    public void gas() {
        System.out.println("Wagon gas");
    }

    @Override
    public int fill() {
        int amountOfGasoline = getAmountOfGasoline();
        if (amountOfGasoline < 50) {
            amountOfGasoline += 20;
        }
        return amountOfGasoline;
    }
}
