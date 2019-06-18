package Algorithmization.Block2_matrix.Task11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        this.matrix = array;
        n = matrix.length;
        m = array[0].length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(range);
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void countFiveInRow() {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int i = 0;
        while (i < n) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            map.put(i, count);
            count = 0;
            i++;
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("\nthese lines contain the number 5 more than 3 times: ");
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() >= 3) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
