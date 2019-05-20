import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[3][3], 10);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("Maximum " + matrix.getMax());
        System.out.println("Minimum " + matrix.getMin());
        System.out.println("AverageArithmetic " + matrix.getAverageArithmetic());
        System.out.println("AverageGeometric " + matrix.getAverageGeometric());
        System.out.println("IndexOfLocalMin " + matrix.getIndexOfLocalMin());
        System.out.println("Transposed matrix:");
        matrix.transposedMatrix();
        matrix.print();
    }
}
