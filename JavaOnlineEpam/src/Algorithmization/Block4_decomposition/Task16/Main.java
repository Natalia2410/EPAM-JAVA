package Algorithmization.Block4_decomposition.Task16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        print(getListNumber(n));
        System.out.println("");
        System.out.println(sum(getListNumber(n)));
        System.out.println(countEvenDigitInSum(sum(getListNumber(n))));
    }

    public static int countEvenDigitInSum(int sum) {
        int count = 0;
        while (sum > 0) {
            int digit = sum % 10;
            if (digit % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }

    public static int sum(ArrayList<Integer> list) {
        int n = list.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static ArrayList<Integer> getListNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (isOnlyOddDigit(getDigit(i))) {
                list.add(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> getDigit(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            list.add(digit);
            n /= 10;
        }
        return list;
    }

    public static boolean isOnlyOddDigit(ArrayList<Integer> list) {
        int n = list.size();
        boolean result = false;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 != 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void print(ArrayList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
