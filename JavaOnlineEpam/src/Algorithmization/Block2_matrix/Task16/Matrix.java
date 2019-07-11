package Algorithmization.Block2_matrix.Task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//public class Matrix {
//   int n;
//    In[][] matrix;
//
//    public void initialize(int[][] array) {
//        this.matrix = array;
//        n = matrix.length;
//        if (n % 2 == 0) {
//            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(matrix));
//            permute(matrix,0);
//        } else {
//            odd(matrix);
//        }
//    }
//
//    public static void odd(int[][] array) {//не четный
//        int n = array.length;
//        int number = 1;
//        int row = 0;
//        int column = n / 2;
//        array[row][column] = number;
//        int currentRow = row;
//        int currentColumn = column;
//
//        while (number < n * n) {
//            row--;
//            column++;
//            if (row < 0) {
//                row = n - 1;
//            }
//            if (column >= n) {
//                column = 0;
//
//            }
//            if (array[row][column] != 0) {
//                row = currentRow + 1;
//                column = currentColumn;
//            }
//            array[row][column] = ++number;
//            currentRow = row;
//            currentColumn = column;
//        }
//    }
//
//    public static void permute(ArrayList<Integer> array, int k) {//четно-не четный
//
//        for (int i = k; i < arr.size(); i++) {
//            java.util.Collections.swap(arr, i, k);
//            permute(arr, k + 1);
//            java.util.Collections.swap(arr, k, i);
//        }
//        if (k == arr.size() - 1) {
//            System.out.println(java.util.Arrays.toString(arr.toArray()));
//        }
//    }
//
//
//    public void print() {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("| " + matrix[i][j] + " ");
//            }
//            System.out.println("|");
//        }
//    }
//}

