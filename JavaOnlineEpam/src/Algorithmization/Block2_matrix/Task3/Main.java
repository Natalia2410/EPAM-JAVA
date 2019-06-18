package Algorithmization.Block2_matrix.Task3;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[5][6], 10);
        System.out.println("Original matrix:");
        matrix.print();
        matrix.printKrow(2);
        System.out.println("");
        matrix.printPcolumn(4);
    }
}
