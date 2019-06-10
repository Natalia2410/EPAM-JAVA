import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initialize(array, n);
        printAll(array);
        System.out.println("");
        print(array);
    }

    public static void initialize(int[] array, int range) {
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(range);
        }
    }

    public static void printAll(int[] array) {
        for(Integer x : array){
            System.out.print(x + " ");
        }
    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
