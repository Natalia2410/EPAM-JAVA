package BasicsOfSoftwareCodeDevelopment.Сycle.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        int sum = 0;
        if (number > 1) {
            for (int i = 1; i < number; i++) {
                sum += i;
            }
            System.out.println("sum is " + sum);
        } else {
            System.out.println("number must be > 1");
        }
    }
}
