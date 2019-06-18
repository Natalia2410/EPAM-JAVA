package Algorithmization.Block1_arrays.Task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initialize(array, 100);
        print(array);
        int min = min(array);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                list.add(array[i]);
            }
        }
        System.out.println("");
        for (Integer x : list) {
            System.out.print(x + " ");
        }
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

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
