import java.util.Random;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array) throws MyException {
        this.matrix = array;
        n = matrix.length;
        m = array[0].length;
        if (n < m - 1) {
            throw new MyException("ERROR.The number of rows cannot be less than the number of columns - 1");
        }
        Random random = new Random();
        int j = 0;
        while (j < m) {
            for (int i = 0; i < j; i++) {
                int row = random.nextInt(n);
                if (matrix[row][j] == 0) {
                    matrix[row][j] = 1;
                } else {
                    i--;
                }
            }
            j++;
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
}
