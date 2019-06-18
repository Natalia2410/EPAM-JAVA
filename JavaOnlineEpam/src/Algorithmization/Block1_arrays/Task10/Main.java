package Algorithmization.Block1_arrays.Task10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] array = new int[n];
        initialize(array, 100);
        print(array);
        changeArray(array);
        System.out.println("");
        print(array);
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void print(int[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public static void changeArray(int[] array) {
        int i = 1;
        int k = 0;
        while (i < array.length / 2) {
            array[i] = array[i * 2];
            i++;
            k = i;
        }
        for (int j = k; j < array.length; j++) {
            array[j] = 0;
        }
    }
}
