import java.util.*;

public class Matrix {
    int n;
    int m;
    int[][] matrix;

    public void initialize(int[][] array, int range) {
        matrix = array;
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
    
    public void snail() {
        int leftBorder = 0;
        int rightBorder = n - 1;
        int upperBorder = 0;
        int lowerBorder = n - 1;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        int i = 0;
        int j = 0;
        int vector = 0;
        for (int k = 0; k < n * n; k++) {
            matrix[i][j] = list.get(k);
            switch (vector) {
                case 0:
                    j++;
                    if (j == rightBorder) {
                        vector = 1;
                        upperBorder++;
                    }
                    break;
                case 1:
                    i++;
                    if (i == lowerBorder) {
                        vector = 2;
                        rightBorder--;
                    }
                    break;
                case 2:
                    j--;
                    if (j == leftBorder) {
                        vector = 3;
                        lowerBorder--;
                    }
                    break;
                case 3:
                    i--;
                    if (i == upperBorder) {
                        vector = 0;
                        leftBorder++;
                    }
                    break;
            }
        }
    }
}