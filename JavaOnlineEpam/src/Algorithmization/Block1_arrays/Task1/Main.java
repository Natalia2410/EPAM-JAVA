package Algorithmization.Block1_arrays.Task1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        initialize(array, 100);
        System.out.println("sum " + getSum(array, 2));
    }

    public static int getSum(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }
}
