package Algorithmization.Block2_matrix.Task16;

import java.util.Random;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array) {
        this.matrix = array;
        n = matrix.length;
        if (n % 2 == 0) {
            even(matrix);
        } else {
            odd((matrix));
        }
    }

    public static void odd(int[][] array) {//не четный
        int n = array.length;
        int number = 1;
        int row = 0;
        int column = n / 2;
        array[row][column] = number;
        int currentRow = row;
        int currentColumn = column;
        while (number < n * n) {
            row--;
            column++;
            if (row < 0) {
                row = n - 1;
            }
            if (column >= n) {
                column = 0;
            }
            if (array[row][column] != 0) {
                row = currentRow + 1;
                column = currentColumn;
            }
            array[row][column] = ++number;
            currentRow = row;
            currentColumn = column;
        }
    }

    public static void even(int[][] array) {//четный

    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}