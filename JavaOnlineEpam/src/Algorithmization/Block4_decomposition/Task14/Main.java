package Algorithmization.Block4_decomposition.Task14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(armstrong(10000));
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }

    public static ArrayList<Integer> armstrong(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            if (Math.pow(sumDigit(i), countDigit(i)) == i) {
                list.add(i);
            }
        }
        return list;
    }

    public static void print(ArrayList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
