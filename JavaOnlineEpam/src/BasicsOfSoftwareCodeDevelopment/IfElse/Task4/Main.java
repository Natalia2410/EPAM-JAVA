package BasicsOfSoftwareCodeDevelopment.IfElse.Task4;


public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube(7, 2, 7);
        Square square = new Square(8, 6);
        if (Cube.isСlimb(cube, square)) {
            System.out.println("the cube will fit into the square");
        } else {
            System.out.println("the cube will not fit into the square");
        }
    }
}

