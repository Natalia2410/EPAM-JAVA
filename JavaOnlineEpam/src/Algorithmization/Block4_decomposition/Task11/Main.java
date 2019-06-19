package Algorithmization.Block4_decomposition.Task11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10000000);
        int m = random.nextInt(10000000);
        System.out.println(n);
        System.out.println(m);
        if (getCountDigit(n) > getCountDigit(m)) {
            System.out.println("the first number contains more digits than the second");
        } else if (getCountDigit(n) < getCountDigit(m)) {
            System.out.println("the second number contains more digits than the first");
        } else {
            System.out.println("numbers contain the same number of digits");
        }
    }

    public static int getCountDigit(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
}
