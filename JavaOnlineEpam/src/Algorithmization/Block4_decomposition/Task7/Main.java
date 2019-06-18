package Algorithmization.Block4_decomposition.Task7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i < n; i += 2) {
            sum += factorial(i);
        }
        System.out.println("Sum factorials = " + sum);
    }

    public static int factorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        return f;
    }
}
