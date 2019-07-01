package Algorithmization.Block3_arrays_sort.Task6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        initialize(array, 100);
        print(array);
        System.out.println("");
        shellaSort(array);
        print(array);
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
            System.out.print(x + " ");
        }
    }

    public static void shellaSort(double[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            if (array[i] <= array[i + 1]) {
                i++;
                if (i == n - 1) {
                    break;
                }
            } else {
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }
}
