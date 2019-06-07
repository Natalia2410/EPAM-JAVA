public class SetPoint {
    private Point point1;
    private Point point2;
    private Point point3;

    public SetPoint(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public static double getEquation(SetPoint equation) {
        return (double)(equation.point3.getX() - equation.point1.getX()) / (equation.point2.getX() - equation.point1.getX()) - (double)(equation.point3.getY() - equation.point1.getY()) / (equation.point2.getY() - equation.point1.getY());
    }
}
