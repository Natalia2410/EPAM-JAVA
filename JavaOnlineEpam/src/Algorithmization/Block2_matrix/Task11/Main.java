package Algorithmization.Block2_matrix.Task11;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[10][20], 15);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println(" ");
        matrix.countFiveInRow();
    }
}
