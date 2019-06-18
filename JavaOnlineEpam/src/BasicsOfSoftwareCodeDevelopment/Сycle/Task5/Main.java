package BasicsOfSoftwareCodeDevelopment.Сycle.Task5;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum = " + sum(0.000000635336,100));
    }

    public static double sum(double e, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double y = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(y) >= e) {
                sum += y;
            }
        }
        return sum;
    }
}
