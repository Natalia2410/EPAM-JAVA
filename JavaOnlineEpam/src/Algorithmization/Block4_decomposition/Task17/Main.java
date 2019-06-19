package Algorithmization.Block4_decomposition.Task17;

public class Main {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(countSubtraction(n));
    }

    public static int countSubtraction(int n) {
        int difference = numberMinusSumDigit(n);
        int count = 1;
        while (difference > 0) {
            difference = numberMinusSumDigit(difference);
            count++;
        }
        return count;
    }

    public static int getSumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int numberMinusSumDigit(int n) {
        int difference = n - getSumDigit(n);
        return difference;
    }
}
