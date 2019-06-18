package Algorithmization.Block2_matrix.Task10;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Matrix matrix = new Matrix();
        matrix.initialize(new int[n][n], 100);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("");
        matrix.positiveElement();
    }
}

