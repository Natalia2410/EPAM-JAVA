public class Main {
    static long number = 8128;
    public static void main(String[] args) {
        if (isPerfect(number)) {
            System.out.println("число " + number + " совершенное ");
        }else {
            System.out.println("число " + number + " не совершенное ");
        }
    }

    public static boolean isPerfect(long number) {
        long sumDivisor = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            long divisor = number / i;
            if (number % i == 0) {
                if (i == divisor) {
                    sumDivisor = sumDivisor + i;
                } else {
                    sumDivisor = sumDivisor + i + divisor;
                }
            }
        }
        if (number == sumDivisor) {
            return true;
        } else {
            return false;
        }
    }
}
