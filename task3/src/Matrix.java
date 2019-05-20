import java.util.*;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        matrix = array;
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public int getMax() {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int getMin() {
        int min = getMax();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public double getAverageArithmetic() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return (double) sum / (n * m);
    }

    public double getAverageGeometric() {
        double p = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p = p * matrix[i][j];
            }
        }
        return Math.pow(p, 1.0 / (n * m));
    }

    public String getIndexOfLocalMin() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < getItem(i + 1, j + 1) &&
                        matrix[i][j] < getItem(i, j + 1) &&
                        matrix[i][j] < getItem(i - 1, j - 1) &&
                        matrix[i][j] < getItem(i, j - 1) &&
                        matrix[i][j] < getItem(i + 1, j) &&
                        matrix[i][j] < getItem(i - 1, j) &&
                        matrix[i][j] < getItem(i - 1, j + 1) &&
                        matrix[i][j] < getItem(i + 1, j - 1)) {
                    return "(" + i + "," + j + ")";
                }
            }
        }
        return "-1";
    }

    public int getItem(int i, int j) {
        int item = 0;
        if (i < 0 || j < 0 || i >= n || j >= m) {
            item = Integer.MAX_VALUE;
        } else {
            item = matrix[i][j];
        }
        return item;
    }

    public void transposedMatrix() {
        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    matrix[j][i] = matrix[i][j] + matrix[j][i];
                    matrix[i][j] = matrix[j][i] - matrix[i][j];
                    matrix[j][i] = matrix[j][i] - matrix[i][j];
                }
            }
        } else {
            int[][] transposedMatrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    transposedMatrix[i][j] = matrix[j][i];
                }
            }
            matrix = transposedMatrix;
        }
    }
}