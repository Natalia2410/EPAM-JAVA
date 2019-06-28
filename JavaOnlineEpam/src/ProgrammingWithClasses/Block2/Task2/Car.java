package ProgrammingWithClasses.Block2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int price;
    private Wheel[] wheels;
    private Engine engine;
    private int amountOfGasoline;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", amountOfGasoline=" + amountOfGasoline +
                '}';
    }

    public int getAmountOfGasoline() {
        return amountOfGasoline;
    }

    public void setAmountOfGasoline(int amountOfGasoline) {
        this.amountOfGasoline = amountOfGasoline;
    }

    public Car(String model, String color, int maxSpeed, int price, Wheel[] wheels, Engine engine, int amountOfGasoline) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.wheels = wheels;
        this.engine = engine;
        this.amountOfGasoline = amountOfGasoline;
    }

    public void printModel() {
        System.out.println(model);
    }

    public abstract void gas();

    public abstract int fill();

    public void changeWheel() {
        ArrayList<Wheel> wheels = new ArrayList<>(Arrays.asList(getWheels()));
        int count = 0;
        Iterator<Wheel> iter = wheels.iterator();
        while (iter.hasNext()) {
            Wheel next = iter.next();
            if (next.getCountOfDayOfUse() > 180) {
                iter.remove();
                count++;
            }
        }
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            wheels.add(new Wheel(random.nextInt(20), 0));
        }

        Wheel[] wheels1 = wheels.toArray(new Wheel[wheels.size()]);
        this.wheels = wheels1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
