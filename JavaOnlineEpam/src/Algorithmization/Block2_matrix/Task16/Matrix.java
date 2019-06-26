package Algorithmization.Block2_matrix.Task16;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array) {
        this.matrix = array;
        n = matrix.length;
        if (n % 2 == 0) {
            if ((n % 2) % 2 == 0) {
                evenEven(matrix);
            } else {
                evenOdd(matrix);
            }
        } else {
            odd(matrix);
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

    public static void evenOdd(int[][] array) {//четно-не четный

    }

    public static void evenEven(int[][] array) {//четный четный
        int n = array.length;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = k;
                k++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 1; j < n / 2; j += 2) {
            list.add(array[0][j]);
        }
        for (int i = n / 2; i < n; i += 2) {
            list.add(array[0][i]);
        }

        for (int j = 1; j < n / 2; j+=2) {
            array[0][j] = array[n - 1][n - 1 - j];
        }
        for (int j = n / 2; j < n; j += 2) {
            array[0][j] = array[n - 1][n - 1 - j];
        }

//        int i = 0;
//        for (int j = n - 2; j >= 1; j--) {
//            array[n - 1][j] = list.get(i);
//            i++;
//
//        }
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

