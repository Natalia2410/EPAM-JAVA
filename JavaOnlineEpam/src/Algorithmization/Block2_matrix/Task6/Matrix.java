package Algorithmization.Block2_matrix.Task6;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array) {
        this.matrix = array;
        n = matrix.length;
        int num = 1;
        int m = n / 2;
        if (n % 2 != 0) {
            System.out.println("n must be even");
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = i; j < n - i; j++) {
                    matrix[i][j] = num;
                }
            }
            int k = 0;
            for (int i = n - 1; i >= m ; i--) {
                for (int j = k; j < n - k; j++) {
                    matrix[i][j] = num;
                }
                k++;
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
}
