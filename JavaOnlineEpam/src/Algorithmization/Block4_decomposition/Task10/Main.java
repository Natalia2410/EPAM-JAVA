package Algorithmization.Block4_decomposition.Task10;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        print(getDigit(random.nextInt(10000000)));
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

    public static void print(ArrayList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
