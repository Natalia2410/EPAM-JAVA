package Algorithmization.Block3_arrays_sort.Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        initialize(array, 100);
        print(array);
        System.out.println("");
        print(selectionSort(array));
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

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int max = array[i];
            int max_i = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
        return array;
    }
}
