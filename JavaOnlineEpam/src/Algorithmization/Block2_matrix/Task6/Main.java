package Algorithmization.Block2_matrix.Task6;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        Matrix matrix = new Matrix();
        matrix.initialize(new int[n][n]);
        if (n % 2 == 0) {
            System.out.println("Original matrix:");
            matrix.print();
        }
    }
}

