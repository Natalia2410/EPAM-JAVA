public class Main {

    public static void main(String[] args) {
        System.out.println(max(min(2, 7), min(2, 5)));
    }

    public static int min(int a, int b) {
        int min = b;
            if (a < b) {
                min = a;
            }
        return min;
    }

    public static int max(int a, int b) {
        int max = b;
            if (a > b) {
                max = a;
            }
        return max;
    }
}
