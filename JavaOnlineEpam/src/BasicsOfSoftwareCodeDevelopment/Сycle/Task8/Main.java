package BasicsOfSoftwareCodeDevelopment.Сycle.Task8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> sameDigits = sameDigits(25252525, 14521452);
        for (Integer x : sameDigits) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> getDifferentDigit(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
        int number1 = 0;
        for (int i = 0; i <= 9; i++) {
            number1 = number;
            while (number1 > 0) {
                int digit = number1 % 10;
                if (digit == i) {
                    digits.add(digit);
                    break;
                }
                number1 = number1 / 10;
            }
        }
        return digits;
    }

    public static ArrayList<Integer> sameDigits(int a, int b) {
        ArrayList<Integer> digits1 = getDifferentDigit(a);
        ArrayList<Integer> digits2 = getDifferentDigit(b);
        ArrayList<Integer> sameDigits = new ArrayList<>();
        for (int i = 0; i < digits1.size(); i++) {
            if (digits2.contains(digits1.get(i))) {
                sameDigits.add(digits1.get(i));
            }
        }
        return sameDigits;
    }
}
