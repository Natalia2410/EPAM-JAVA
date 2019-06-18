package Algorithmization.Block4_decomposition.Task13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        print(twins(70));
    }

    public static ArrayList<String> twins(int n) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        int b = 0;
        while (b < 2 * n) {
            int a = 6 * i - 1;
            b = 6 * i + 1;
            if (a > n && b < 2 * n) {
                if (isSimple(a) && (isSimple(b))) {
                    list.add("(" + String.valueOf(a) + " " + String.valueOf(b) + ")");
                }
                i++;
            } else {
                i++;
            }
        }
        if (n == 3) {
            list.add("(3 5)");
        }
        return list;
    }

    public static void print(ArrayList<String> list) {
        for (String item : list) {
            System.out.print(item + " ");
        }
    }

    public static boolean isSimple(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }
}
