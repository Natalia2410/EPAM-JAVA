package Algorithmization.Block4_decomposition.Task2;

public class Main {
    public static void main(String[] args) {
        int number1 = 120;
        int number2 = 600;
        int number3 = 180;
        int number4 = 300;
        System.out.println("NOD " + nod4(number1, number2, number3, number4));
    }

    public static int nod4(int number1, int number2, int number3, int number4) {
        return nod(nod(nod(number1, number2), number3), number4);
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
}
