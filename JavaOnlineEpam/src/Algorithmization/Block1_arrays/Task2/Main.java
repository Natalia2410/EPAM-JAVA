package Algorithmization.Block1_arrays.Task2;

import java.io.BufferedReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[10];
        initialize(array, 100);
        print(array);
        System.out.print("Count of replace " + replace(array, 20));
        System.out.println("");
        print(array);
    }

    public static int replace(double[] array, double z) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                count++;
                array[i] = z;
            }
        }
        return count;
    }

    public static void initialize(double[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble() * range;
        }
    }

    public static void print(double[] array) {
        for (double x : array) {
            System.out.println(x + " ");
        }
    }
}

