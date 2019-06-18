package Algorithmization.Block4_decomposition.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area = " + 6 * areaOfTriangle(5));
    }

    public static double areaOfTriangle(int a) {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }
}