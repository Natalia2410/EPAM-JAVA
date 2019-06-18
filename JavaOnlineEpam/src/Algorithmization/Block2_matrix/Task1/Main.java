package Algorithmization.Block2_matrix.Task1;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[3][7], 10);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("");
        matrix.printOddcolumn();
    }
}