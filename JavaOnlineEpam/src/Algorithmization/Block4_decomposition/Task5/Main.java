package Algorithmization.Block4_decomposition.Task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initialize(array, 100);
        print(array);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < max(array)) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("");
        System.out.println(max);
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void print(int[] array) {
        for (Integer item : array) {
            System.out.print(item + " ");
        }
    }
}

