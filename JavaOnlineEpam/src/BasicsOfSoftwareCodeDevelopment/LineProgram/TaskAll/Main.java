package BasicsOfSoftwareCodeDevelopment.LineProgram.TaskAll;

public class Main {

    public static void main(String[] args) {
        System.out.println(getValueOfFunction1(3, 5, 7));
        System.out.println(getValueOfFunction2(1, 2, 3));
        System.out.println(getValueOfFunction3(2, 4));
        System.out.println(getReversNumber(245.663));
        System.out.println(getTime(24585));
        System.out.println(isContains(new Point(-2, 4)));
    }

    public static double getValueOfFunction1(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double getValueOfFunction2(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static double getValueOfFunction3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }

    public static double getReversNumber(double r) {
        int a = (int) r;
        return (int) ((r - a) * Math.pow(10, 3)) + a / Math.pow(10, 3);
    }

    public static String getTime(int t) {
        String result = null;
        int hour = 0;
        int minut = 0;
        int sek = 0;
        if (t < 60) {
            hour = 0;
            minut = 0;
            sek = t;
        } else {
            minut = (int) (t / 60);
            if (minut >= 60) {
                hour = minut / 60;
                minut = minut - hour * 60;
                sek = t - minut * 60 - hour * 3600;
            } else {
                hour = 0;
                minut = minut;
                sek = t - minut * 60;
            }
        }
        return hour + " ч " + minut + " мин " + sek + " с";
    }

    public static boolean isContains(Point point) {
        if (point.getY() > 0) {
            return point.getX() >= -2 && point.getX() <= 2 && point.getY() <= 4;
        } else {
            return point.getX() >= -4 && point.getX() <= 4 && point.getY() >= -3;
        }
    }
}

