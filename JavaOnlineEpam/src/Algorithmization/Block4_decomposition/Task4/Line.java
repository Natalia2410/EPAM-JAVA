package Algorithmization.Block4_decomposition.Task4;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getB() {
        return b;
    }

    public Point getA() {
        return a;
    }

    public double length() {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
