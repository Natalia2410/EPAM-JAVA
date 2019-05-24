public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[3][3], 10);
        System.out.println("Original matrix:");
        matrix.print();
        matrix.snail();
        System.out.println("");
        matrix.print();
    }
}
