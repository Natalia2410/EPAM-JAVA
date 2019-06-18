package Algorithmization.Block4_decomposition.Task9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int z = random.nextInt(10);
        int t = random.nextInt(10);
        System.out.println("Area = " + (getAreaRectangularTriangle(x, y) + getAreaSecondTriangle(x, y, z, t)));
    }

    public static double getAreaRectangularTriangle(int x, int y) {
        return (x * y) / 2;
    }

    public static double getSideRectangularTriangle(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double getAreaSecondTriangle(int x, int y, int z, int t) {
        double s = 0;
        double m = getSideRectangularTriangle(x, y);
        double p = (m + z + t) / 2;
        return Math.sqrt(p * (p - m) * (p - z) * (p - t));
    }
}
