package Algorithmization.Block3_arrays_sort.Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[10];
        initialize(array1, 100);
        printArray(array1);
        System.out.println("");
        Integer[] array2 = new Integer[5];
        initialize(array2, 100);
        printArray(array2);
        System.out.println("");
        printList(add(array1, array2));
    }

    public static void initialize(Integer[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static LinkedList<Integer> add(Integer[] array1, Integer[] array2) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(array1));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(array2));
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

    public static void printList(LinkedList<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }
    public static void printArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }
}
