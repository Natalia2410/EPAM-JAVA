package Algorithmization.Block3_arrays_sort.Task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        initialize(array, 100);
        print(array);
        System.out.println("");
        System.out.println("Count = " + bubbleSort(array));
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

    public static int bubbleSort(int[] array) {
        int n = array.length;
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    count++;
                }
            }
        }
        return count;
    }
}
