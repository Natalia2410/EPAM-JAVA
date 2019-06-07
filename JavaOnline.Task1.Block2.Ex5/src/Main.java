public class Main {

    public static void main(String[] args) {
        System.out.println(getFunction(3));
    }

    public static double getFunction(double x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        return result;
    }
}
