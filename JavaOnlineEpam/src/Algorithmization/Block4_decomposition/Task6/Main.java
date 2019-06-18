package Algorithmization.Block4_decomposition.Task6;

public class Main {
    public static void main(String[] args) {
        int number1 = 331;
        int number2 = 463;
        int number3 = 733;
        if (isSimple(number1, number2, number3)) {
            System.out.println("Numbers is simple");
        } else {
            System.out.println("Numbers is not simple");
        }
    }

    public static boolean isSimple(int number1, int number2, int number3) {
        return nod3(number1, number2, number3) == 1;
    }

    public static int nod3(int number1, int number2, int number3) {
        return nod(nod(number1, number2), number3);
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
