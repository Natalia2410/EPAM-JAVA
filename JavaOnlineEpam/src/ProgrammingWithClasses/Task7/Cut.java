package ProgrammingWithClasses.Task7;

public class Cut {
    private Point A;
    private Point B;

    public Cut(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public Point getB() {
        return B;
    }

    public Point getA() {
        return A;
    }

    public double lengthCut() {
        return Math.sqrt(Math.pow((A.getX() - B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
    }
}
