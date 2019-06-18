package Algorithmization.Block2_matrix.Task12;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[3][4], 15);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("Sorting up:");
        matrix.sortUp();
        matrix.print();
        System.out.println("Sorting down:");
        matrix.sortDown();
        matrix.print();
    }
}
