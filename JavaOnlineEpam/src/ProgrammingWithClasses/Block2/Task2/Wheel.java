package ProgrammingWithClasses.Block2.Task2;

public class Wheel {
    private int radius;
    private int countOfDayOfUse;

    public int getCountOfDayOfUse() {
        return countOfDayOfUse;
    }

    public void setCountOfDayOfUse(int countOfDayOfUse) {
        this.countOfDayOfUse = countOfDayOfUse;
    }

    public Wheel(int radius, int countOfDayOfUse) {
        this.radius = radius;
        this.countOfDayOfUse = countOfDayOfUse;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                " countOfDayOfUse=" + countOfDayOfUse +
                '}';
    }
}
