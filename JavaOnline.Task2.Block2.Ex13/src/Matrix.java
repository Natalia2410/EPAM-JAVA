import java.util.Random;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        this.matrix = array;
        n = matrix.length;
        m = array[0].length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(range);
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

    public void sortUp() {
        int k = 0;
        while (k < m) {
            int i = n - 1;
            while (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (matrix[j][k] > matrix[j + 1][k]) {
                        int tmp = matrix[j][k];
                        matrix[j][k] = matrix[j + 1][k];
                        matrix[j + 1][k] = tmp;
                    }
                }
                i--;
            }
            k++;
        }
    }

    public void sortDown() {
        int k = 0;
        while (k < m) {
            int i = n - 1;
            while (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (matrix[j][k] < matrix[j + 1][k]) {
                        int tmp = matrix[j][k];
                        matrix[j][k] = matrix[j + 1][k];
                        matrix[j + 1][k] = tmp;
                    }
                }
                i--;
            }
            k++;
        }
    }
}
