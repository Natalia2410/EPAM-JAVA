package Algorithmization.Block2_matrix.Task5;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array) {
        this.matrix = array;
        n = matrix.length;
        int num = 1;
        if (n % 2 != 0) {
            System.out.println("n must be even");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    matrix[i][j] = num;
                }
                num++;
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
