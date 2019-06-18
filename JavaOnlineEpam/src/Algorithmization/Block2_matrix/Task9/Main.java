package Algorithmization.Block2_matrix.Task9;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[2][3], 10);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("");
        for (Integer x : matrix.sumInColumn()) {
            System.out.println("Max summa in " + x + " column");
        }
    }
}

