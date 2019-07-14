package BasicsOfOOP.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Payment payment1 = new Payment("First payment:");
        payment1.setPayment();
        payment1.printCheque();
    }
}
