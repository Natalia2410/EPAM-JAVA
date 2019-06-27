package ProgrammingWithClasses.Task5;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(30,60);
        System.out.println("Current " + counter.getCurrent());
        try {
            int n = 100;
            for (int i = 0; i < n; i++) {
                counter.increase();
                System.out.println(counter.getCurrent());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
