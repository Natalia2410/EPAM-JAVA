package ProgrammingWithClasses.Block2.Task2;

public class Sedan extends Car {

    public Sedan(String model, String color, int maxSpeed, int price, Wheel[] wheels, Engine engine, int amountOfGasoline) {
        super(model, color, maxSpeed, price, wheels, engine, amountOfGasoline);
    }

    @Override
    public void gas() {
        System.out.println("Sedan gas");
    }

    @Override
    public int fill() {
        int amountOfGasoline = getAmountOfGasoline();
        if (amountOfGasoline < 50) {
            amountOfGasoline += 10;
        }
        return amountOfGasoline;
    }
}
