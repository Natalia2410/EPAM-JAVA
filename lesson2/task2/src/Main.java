import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static int count = 0;
    static long number = 456;
    static long number2 = 56;
    ;

    public static void main(String[] args) {
        System.out.println("максимальная цифра числа " + number + " равна " + getMaxDigitOfNumber(number));

        if (isPalindrome(number) == true) {
            System.out.println("\nчисло " + number + " палиндром");
        } else {
            System.out.println("\nчисло " + number + " не палиндром");
        }

        if (isSimple(number) == true) {
            System.out.println("\nчисло " + number + " простое");
        } else {
            System.out.println("\nчисло " + number + " составное");
        }
        System.out.println("\nпростые делители числа " + number + ":");
        printSimpleDivisor(number );

        System.out.println("\nнаибольший общий делитель чисел " + number + " и " + number2 + " = " + nod(number, number2));
        System.out.println("\nнаименьшее общее кратное чисел " + number + " и " + number2 + " = " + nok1(number, number2));
        System.out.println("\nнаименьшее общее кратное чисел " + number + " и " + number2 + " = " + nok2(number, number2));
        System.out.println("\nколичество различныйх цифр числа " + number + " = " + differentNumber(number));

    }

    public static long getMaxDigitOfNumber(long number) {
        long maxDigit = 0;
        while (number > 0) {

            long digit = number % 10;
            number = number / 10;

            if (digit >= maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }

    public static boolean isPalindrome(long number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static long reverse(long number) {
        long reverseNumber = 0;
        while (number > 0) {
            long digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;

        }
        return reverseNumber;
    }

    public static boolean isSimple(long number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 1;
    }

    public static void printSimpleDivisor(long number) {
        if (isSimple(number)) {
            System.out.println(number);
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            long divisor = number / i;
            if (number % i == 0) {
                if (isSimple(i)) {
                    System.out.print(i + " ");
                }
                if (isSimple(divisor)) {
                    System.out.print(divisor + " ");
                }
            }
        }
    }

    public static long nod(long number1, long number2) {
        long nod = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number1 % i == 0) {
                if (number2 % i == 0) {
                    if (i > nod) {
                        nod = i;
                    }
                }
                long divisor = number1 / i;
                if (number2 % divisor == 0) {
                    nod = divisor;
                    break;
                }
            }
        }
        return nod;
    }

    public static long nok1(long number1, long number2) {
        ArrayList<Long> divisor1 = new ArrayList<>();
        ArrayList<Long> divisor2 = new ArrayList<>();
        divisor1 = getSimpleDivisor(number1);
        divisor2 = getSimpleDivisor(number2);
        long nok = number1;
        for (int j = 0; j < divisor2.size(); j++) {
            if (!(divisor1.contains(divisor2.get(j)))) {
                nok = nok * divisor2.get(j);
            } else {
                Iterator<Long> iter = divisor1.iterator();
                while (iter.hasNext()) {
                    long next = iter.next();
                    if (next == divisor2.get(j)) {
                        iter.remove();
                        break;
                    }
                }
            }
        }
        return nok;
    }

    public static ArrayList<Long> getSimpleDivisor(long number) {
        ArrayList<Long> divisor = new ArrayList<>();
        long i = 2;
        long nok = number;
        long num = number;
        while (i <= Math.sqrt(num)) {
            if (isSimple(number)) {
                divisor.add(number);
                break;
            } else if (number % i == 0) {
                divisor.add(i);
                number = number / i;
            } else {
                i++;
            }
        }
        return divisor;
    }

    public static long nok2(long number1, long number2) {
        long nok = number1 * number2 / nod(number1, number2);
        return nok;
    }

    public static int differentNumber(long number) { //45677183
        int countDifferentDigitOfNumber = 0;
        long number1 = 0;
        for (int i = 0; i <= 9; i++) {
            number1 = number;
            while (number1 > 0) {
                long digit = number1 % 10;//3
                if (digit == i) {
                    countDifferentDigitOfNumber++;
                    break;
                }
                number1 = number1 / 10;
            }
        }
        return countDifferentDigitOfNumber;
    }

}
