package ProgrammingWithClasses.Task7;

public class Main {
    public static void main(String[] args) {
        Point A = new Point(2, 4);
        Point B = new Point(7, 1);
        Point C = new Point(1, 3);

        Cut AB = new Cut(A, B);
        double d1 = AB.lengthCut();
        System.out.println(d1);
        Cut AC = new Cut(A, C);
        double d2 = AC.lengthCut();
        System.out.println(d2);
        Cut BC = new Cut(B, C);
        double d3 = BC.lengthCut();
        System.out.println(d3);

        Triangle triangle = new Triangle(d1, d2, d3);
        if (triangle.isTriangle()) {
            System.out.println("Perimeter " + triangle.perimeter());
            System.out.println("Area " + triangle.area());
        } else {
            System.out.println("It is't triangle");
        }

        double Ox = (A.getX() + B.getX() + C.getX()) / 3;
        double Oy = (A.getY() + B.getY() + C.getY()) / 3;
        System.out.println("the center of gravity of the triangle " + "(" + Ox + " , " + Oy + ")");
    }
}
