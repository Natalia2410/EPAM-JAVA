package BasicsOfSoftwareCodeDevelopment.IfElse.Task4;

public class Cube extends Square {
    private int c;

    public Cube(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public static boolean isСlimb(Cube cube, Square square) {
        boolean climb = false;
        if (cube.getA() < square.getA() && (cube.getB() < square.getB())) {
            climb = true;
        } else if (cube.getA() < square.getB() && (cube.getB() < square.getA())) {
            climb = true;
        } else if (cube.getA() < square.getA() && (cube.getC() < square.getB())) {
            climb = true;
        } else if (cube.getA() < square.getB() && (cube.getC() < square.getA())) {
            climb = true;
        } else if (cube.getB() < square.getA() && (cube.getC() < square.getB())) {
            climb = true;
        } else if (cube.getB() < square.getB() && (cube.getC() < square.getA())) {
            climb = true;
        }
        return climb;
    }
}

