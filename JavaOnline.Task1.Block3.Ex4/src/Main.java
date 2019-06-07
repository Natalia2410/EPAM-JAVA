import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger p = BigInteger.valueOf(1);
        int max = 200;
        for (int i = 1; i <= max; i++) {
            p = p.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(p);
    }
}
