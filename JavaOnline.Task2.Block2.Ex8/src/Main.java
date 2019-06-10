import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix();
        matrix.initialize(new int[5][6], 10);
        System.out.println("Original matrix:");
        matrix.print();
        try {
            matrix.changeColumn();
            System.out.println("Change matrix:");
            matrix.print();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Wrong number");
        }
    }
}
