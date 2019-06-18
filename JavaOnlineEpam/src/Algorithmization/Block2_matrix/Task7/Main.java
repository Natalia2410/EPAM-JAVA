package Algorithmization.Block2_matrix.Task7;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Matrix matrix = new Matrix();
        System.out.println("count of positive elements " + matrix.initialize(new double[n][n]));
        System.out.println("Original matrix:");
        matrix.print();
    }
}
