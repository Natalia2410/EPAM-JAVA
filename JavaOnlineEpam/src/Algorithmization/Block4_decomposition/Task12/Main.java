package Algorithmization.Block4_decomposition.Task12;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initialize(array, 12, 1500);
        print(array);
    }

    public static void initialize(int[] array, int K, int N) {
        Random random = new Random();
        int m = array.length;
        for (int i = 0; i < m; i++) {
            while (true) {
                int n = random.nextInt();
                if (getSumDigit(n) == K && n < N) {
                    array[i] = n;
                    break;
                }
            }
        }
    }

    public static int getSumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void print(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
