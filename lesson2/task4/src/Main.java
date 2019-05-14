public class Main {

    public static void main(String[] args) {
        long lowerLimit = 200;
        long upperLimit = 4000;
        for (long i = lowerLimit; i < upperLimit - 2; i++) {
            for (long j = i + 1; j < upperLimit; j++) {
                if (isFriendlyNumbers(i, j)) {
                    System.out.println(i + " и " + j + " дружественные ");
                }
            }
        }
    }

    public static boolean isFriendlyNumbers(long number1, long number2) {
        long sumDivisor1 = sumDivisor(number1);
        long sumDivisor2 = sumDivisor(number2);

        if (sumDivisor1 == number2 && sumDivisor2 == number1) {
            return true;
        } else {
            return false;
        }
    }

    public static long sumDivisor(long number) {
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
        return sumDivisor;
    }
}
