package Algorithmization.Block4_decomposition.Task15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        print(getListNumber(4));
    }

    public static ArrayList<Integer> getListNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (isGrowing(getDigit(i))) {
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
            n = n / 10;
        }
        return list;
    }

    public static boolean isGrowing(ArrayList<Integer> list) {
        int n = list.size();
        boolean result = false;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i + 1) < list.get(i)) {
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
