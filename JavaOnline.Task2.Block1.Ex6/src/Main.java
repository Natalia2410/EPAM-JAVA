import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        initialize(array, 100);
        print(array);
        System.out.println("");
        System.out.println("sum " + sum(array));
    }

    public static void initialize(double[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble() * range;
        }
    }

    public static void print(double[] array) {
        for (double x : array) {
            System.out.println(x + " ");
        }
    }

    public static boolean isSimple(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isSimple(i)) {
                sum += array[i];
            }
        }
        return sum;
    }
}
