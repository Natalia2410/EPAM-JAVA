package Algorithmization.Block3_arrays_sort.Task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[10];
        Integer[] array2 = new Integer[10];
        initialize(array1, 100);
        initialize(array2, 100);
        Arrays.sort(array1);
        Arrays.sort(array2);
        printArray(array1);
        System.out.println("");
        printArray(array2);
        System.out.println("");
        printList(insertSort(array1, array2));
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

    public static ArrayList<Integer> insertSort(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        int n = list1.size();
        int m = list2.size();
        for (int i = 0; i < m; i++) {
            int curr = list2.get(i);
            int k = n - 1 + i;
            list1.add(search(curr, list1, 0, k), curr);
        }
        return list1;
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
