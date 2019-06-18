package BasicsOfSoftwareCodeDevelopment.Сycle.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m1 = reader.readLine();
        String n1 = reader.readLine();
        int m = Integer.parseInt(m1);
        int n = Integer.parseInt(n1);
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = m; i < n; i++) {
            divisors = getDivisors(i);
            System.out.print(i + ": ");
            for (Integer x : divisors) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }

    public static ArrayList<Integer> getDivisors(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            int divisor = number / i;
            if (number % i == 0) {
                list.add(i);
                if (i != divisor) {
                    list.add(divisor);
                }
            }
        }
        return list;
    }
}

