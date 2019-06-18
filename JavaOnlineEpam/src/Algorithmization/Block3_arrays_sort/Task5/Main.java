package Algorithmization.Block3_arrays_sort.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        initialize(array, 100);
        printArray(array);
        System.out.println("");
        printList(insertSort(array));
    }

    public static void initialize(Integer[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void printArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }


    public static ArrayList<Integer> insertSort(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int count = 0;
            int curr = list.get(i);
            Iterator<Integer> iter = list.iterator();
            while (iter.hasNext()) {
                int next = iter.next();
                if (next == curr) {
                    iter.remove();
                    count++;
                }
            }
            for (int j = 0; j < count; j++) {
                list.add(search(curr, list, 0, i - 1), curr);
            }
        }
        return list;
    }

    public static int search(int elem, ArrayList<Integer> list, int low, int high) {
        int result = 0;
        if (high - low == 0) {
            if (elem > list.get(low)) {
                result = low + 1;
            } else {
                result = low;
            }
        } else if (high - low == 1) {
            if (elem <= list.get(low)) {
                result = low;
            } else if (elem >= list.get(high)) {
                result = high + 1;
            } else {
                result = low + 1;
            }
        } else {
            while (high - low > 1) {
                int mid = low + (high - low) / 2;

                if (elem < list.get(mid)) {
                    return search(elem, list, low, mid - 1);

                } else if (elem > list.get(mid)) {
                    return search(elem, list, mid + 1, high);
                } else {
                    result = mid;
                }
            }
        }
        return result;
    }
}
