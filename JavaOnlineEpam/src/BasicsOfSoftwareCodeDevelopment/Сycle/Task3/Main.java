package BasicsOfSoftwareCodeDevelopment.Сycle.Task3;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        for (int i = 0; i <= max; i++) {
            sum += i * i;
        }
        System.out.println("sum = " + sum);
    }
}
