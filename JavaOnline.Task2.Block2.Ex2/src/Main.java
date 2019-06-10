public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int n = 7;
        matrix.initialize(new int[n][n], 10);
        System.out.println("Original matrix:");
        matrix.print();
        System.out.println("");
        matrix.printFromMainDiagonal();
        System.out.println("");
        matrix.printFromSecondDiagonal();
    }
}
