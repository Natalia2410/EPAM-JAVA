import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        initialize(array, 10);
        print(array);
        System.out.println("");
        System.out.println(max(createNewArray(array)));

    }

    public static void initialize(double[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void print(double[] array) {
        for (double x : array) {
            System.out.print(x + " ");
        }
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double[] createNewArray(double[] array) {
        int m = array.length;
        int n = m / 2;
        double[] arrayNew = new double[n];
        for (int i = 0; i < n; i++) {
            arrayNew[i] = array[i] + array[m - 1 - i];
        }
        return arrayNew;
    }

}
