package Algorithmization.Block2_matrix.Task10;

import java.util.Random;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        this.matrix = array;
        n = matrix.length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(range) - range / 2;
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void positiveElement() {
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
