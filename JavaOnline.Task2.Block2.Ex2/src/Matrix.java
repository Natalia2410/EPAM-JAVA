import java.util.Random;

public class Matrix {
    int n;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        this.matrix = array;
        n = matrix.length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(range) + 1;
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

    public void printFromMainDiagonal() {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    public void printFromSecondDiagonal() {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }
    }
}
