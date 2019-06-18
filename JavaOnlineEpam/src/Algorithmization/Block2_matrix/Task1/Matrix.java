package Algorithmization.Block2_matrix.Task1;

import java.util.Random;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        this.matrix = array;
        n = matrix.length;
        m = matrix[0].length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(range) + 1;
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

    public void printOddcolumn() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j += 2) {
                if (matrix[0][j] > matrix[n - 1][j]) {
                    System.out.print("| " + matrix[i][j] + " ");
                }
            }
            System.out.println("|");
        }
    }
}

