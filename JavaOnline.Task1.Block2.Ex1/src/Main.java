public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 190);
        if (isTriangle(triangle)) {
            System.out.println("it's a triangle");
            if (isrRectangular(triangle)) {
                System.out.println("triangle is rectangular");
            } else {
                System.out.println("triangle is not rectangular");
            }
        } else {
            System.out.println("it's not a triangle");
        }
    }

    public static boolean isTriangle(Triangle triangle) {
        return !(triangle.getCorner1() + triangle.getCorner2() >= 180);
    }

    public static boolean isrRectangular(Triangle triangle) {
        return triangle.getCorner1() == 90 || triangle.getCorner2() == 90 || (180 - triangle.getCorner1() - triangle.getCorner2()) == 90;
    }
}

