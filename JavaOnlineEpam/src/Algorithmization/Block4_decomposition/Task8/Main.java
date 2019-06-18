package Algorithmization.Block4_decomposition.Task8;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        initialize(array, 10);
        printArray(array);
        System.out.println("");
        printList(getSum(array, 1, 5));
    }

    public static ArrayList<Integer> getSum(int[] array, int k, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int j = k;
        while (j < m - 1) {
            for (int i = j; i < j + 3; i++) {
                sum += array[i];
            }
            list.add(sum);
            sum = 0;
            j++;
        }
        return list;
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
