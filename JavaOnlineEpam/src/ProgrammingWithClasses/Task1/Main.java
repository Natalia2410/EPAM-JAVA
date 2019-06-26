package ProgrammingWithClasses.Task1;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(7);
        test1.setB(8);
        test1.printA();
        test1.printB();
        System.out.println("sum " + test1.sum(test1.getA(), test1.getB()));
        System.out.println("max " + test1.max(test1.getA(), test1.getB()));
    }
}
