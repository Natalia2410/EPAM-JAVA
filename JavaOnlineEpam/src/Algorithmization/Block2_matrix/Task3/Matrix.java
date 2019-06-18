package Algorithmization.Block2_matrix.Task3;

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

    public void printKrow(int k) {
        if (k < n) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[k][j] + " ");
            }
        } else {
            System.out.println("Wrong number of row");
        }
    }

    public void printPcolumn(int p) {
        if (p < m) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][p] + " ");
            }
        } else {
            System.out.println("Wrong number of column");
        }
    }
}
