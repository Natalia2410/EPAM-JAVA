public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[3][4], 100);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("Change matrix:");
        matrix.changeOdd();
        matrix.print();
    }
}
