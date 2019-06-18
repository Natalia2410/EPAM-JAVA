package Algorithmization.Block1_arrays.Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 50;
        double[] array = new double[n];
        initialize(array, 100);
        print(array);
        System.out.println("count of negative elements: " + getCountOfNegative(array));
        System.out.println("count of positive elements: " + getCountOfPositive(array));
        System.out.println("count of null elements: " + getCountOfNull(array));

    }

    public static int getCountOfNegative(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int getCountOfPositive(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int getCountOfNull(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void initialize(double[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (random.nextDouble() > 0.5) {
                array[i] = random.nextDouble() * range - range / 2;
            } else {
                array[i] = 0;
            }
        }
    }

    public static void print(double[] array) {
        for (double x : array) {
            System.out.println(x + "");
        }
    }
}
