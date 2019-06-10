import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                matrix[i][j] = random.nextInt(range) + 1;
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

    public void changeColumn() throws ArrayIndexOutOfBoundsException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int column1 = Integer.parseInt(s1);
        int column2 = Integer.parseInt(s2);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column1] = matrix[i][column1] + matrix[i][column2];
            matrix[i][column2] = matrix[i][column1] - matrix[i][column2];
            matrix[i][column1] = matrix[i][column1] - matrix[i][column2];
        }
    }
}
