package Algorithmization.Block4_decomposition.Task1;

public class Main {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 50;
        System.out.println("NOD " + nod(number1, number2));
        System.out.println("NOK " + nok(number1, number2));
    }

    public static int nod(int number1, int number2) {
        int nod = 0;
        int number = 0;
        if (number1 < number2) {
            number = number1;
        } else {
            number = number2;
        }
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number1 % i == 0) {
                if (number2 % i == 0) {
                    if (i > nod) {
                        nod = i;
                    }
                }
                int divisor = number1 / i;
                if (number2 % divisor == 0) {
                    nod = divisor;
                    break;
                }
            }
        }
        return nod;
    }

    public static int nok(int number1, int number2) {
        int nok = number1 * number2 / nod(number1, number2);
        return nok;
    }
}
