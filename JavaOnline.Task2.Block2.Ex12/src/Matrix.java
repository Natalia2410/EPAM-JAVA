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
        for (int k = 0; k < n; k++) {
            for (int i = m - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix[k][j] > matrix[k][j + 1]) {
                        int tmp = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = tmp;
                    }
                }
            }
        }
    }

    public void sortDown() {
        for (int k = 0; k < n; k++) {
            for (int i = m - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix[k][j] < matrix[k][j + 1]) {
                        int tmp = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = tmp;
                    }
                }
            }
        }
    }
}
