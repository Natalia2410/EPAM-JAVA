import java.util.Random;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array) {
        this.matrix = array;
        n = matrix.length;
        if (n % 2 != 0) {
            System.out.println("n must be even");
        } else {
            int num = 1;
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num++;
                }
                num = 1;
            }
            num = 1;
            for (int i = 1; i < n; i += 2) {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
                num = 1;
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
