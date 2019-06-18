package Algorithmization.Block1_arrays.Task4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        initialize(array, 100);
        print(array);
        changeNumber(array);
        System.out.println("");
        print(array);
    }

    public static void changeNumber(double[] array) {
        double temp = 0;
        int maxN = maxNumber(array);
        int minN = minNumber(array);
        temp = array[maxN];
        array[maxN] = array[minN];
        array[minN] = temp;
    }


    public static int maxNumber(double[] array) {
        double max = array[0];
        int maxN = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxN = i;
            }
        }
        return maxN;
    }

    public static int minNumber(double[] array) {
        double min = array[0];
        int minN = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minN = i;
            }
        }
        return minN;
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
            System.out.println(x + "");
        }
    }
}

