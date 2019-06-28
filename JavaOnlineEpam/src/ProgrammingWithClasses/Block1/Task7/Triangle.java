package ProgrammingWithClasses.Block1.Task7;

public class Triangle {
    private double d1;
    private double d2;
    private double d3;

    public Triangle(double d1, double d2, double d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getD3() {
        return d3;
    }

    public double getD2() {
        return d2;
    }

    public double getD1() {
        return d1;
    }

    public double perimeter() {
        return d1 + d2 + d3;
    }

    public boolean isTriangle() {
        if (d1 < d2 + d3 && d2 < d1 + d3 && d3 < d1 + d2) {
            return true;
        } else {
            return false;
        }
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
    }
}
