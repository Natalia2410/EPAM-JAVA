package Algorithmization.Block3_arrays_sort.Task8;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int n = 10;

    public static void main(String[] args) {
        int[] p = new int[n];
        initialize(p, 10);
        print(p);
        System.out.println("");
        int[] q = new int[n];
        initialize(q, 5);
        print(q);
        System.out.println("\n");
        System.out.println(printFractions(p, q));
        System.out.println("Before the sorting:");
        System.out.println(printBringCommonDenominator(p, q));
        System.out.println("After the sorting:");
        System.out.println(sort(p, q));
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range) + 1;
        }
    }

    public static void print(int[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public static String printFractions(int[] p, int[] q) {
        String str = "";
        for (int i = 0; i < p.length; i++) {
            str += (p[i] + "/" + q[i]) + " ";
        }
        return str;
    }

    public static String printBringCommonDenominator(int[] p, int[] q) {
        int denominator = 1;
        String str = "";
        for (int i = 0; i < q.length; i++) {
            denominator *= q[i];
        }
        for (int i = 0; i < p.length; i++) {
            str += (p[i] * denominator / q[i] + "/" + denominator) + " ";
        }
        return str;
    }

    public static String sort(int[] p, int[] q) {
        int denominator = 1;
        String result = "";
        for (int i = 0; i < q.length; i++) {
            denominator *= q[i];
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = p[i] * denominator / q[i];
        }
        shellaSort(array);
        for (int i = 0; i < array.length; i++) {
            result += array[i] + "/" + denominator + " ";
        }
        return result;
    }

    public static void shellaSort(int[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            if (array[i] <= array[i + 1]) {
                i++;
                if (i == n - 1) {
                    break;
                }
            } else {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }
}
