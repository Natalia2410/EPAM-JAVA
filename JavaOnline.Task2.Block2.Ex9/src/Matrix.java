import java.util.*;

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

    public ArrayList<Integer> sumInColumn() {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int sum = 0;
        while (j < m) {
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            map.put(j, sum);
            j++;
            sum = 0;
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        int maxSum = Collections.max(map.values());
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSum) {
                list.add(pair.getKey());
            }
        }
        return list;
    }
}
