package BasicsOfSoftwareCodeDevelopment.IfElse.Task3;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(-8, 2);
        Point point2 = new Point(-3, -3);
        Point point3 = new Point(-5, -1);
        SetPoint equation = new SetPoint(point1, point2, point3);
        if (Math.abs(SetPoint.getEquation(equation)) < Math.pow(10, -10)) {
            System.out.println("Points on one line");
        } else {
            System.out.println("points are not on one line");
        }
    }
}
