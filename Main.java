import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        //Main.task1();
        //Main.task2();
        // Main.task3();
        //Main.task4();
        //Main.task5();
        // Main.task6();
        //Main.task7();
        // Main.task21();
        //Main.task22();
        // Main.task23();
        Main.task24();
    }

    public static void task1() {
        if (equals(1, 1, 1)) {
            System.out.println("Числа одинаковые");
        } else {
            System.out.println("Числа разные");
        }
    }

    public static boolean equals(double a, double b, double c) {
        if (a == b && a == c) {
            return true;
        } else {
            return false;
        }
    }

    public static void task2() {
        double weight = 24;
        System.out.println("Вес динозавра в миллиграммах " + kgToMg(weight));
        System.out.println("Вес динозавра в граммах " + kgToGr(weight));
        System.out.println("Вес динозавра в тоннах " + kgToTon(weight));
    }

    public static double kgToMg(double kg) {
        return 1000000 * kg;
    }

    public static double kgToGr(double kg) {
        return 1000 * kg;
    }

    public static double kgToTon(double kg) {
        return 0.001 * kg;
    }


    public static void task3() {
        double areaOfRing = getRingArea(6, 2);
        if (areaOfRing > 0) {
            System.out.println("Площадь кольца равна " + areaOfRing);
        } else {
            System.out.println("Радиус вторго больше радиуса первого");
        }
    }

    public static double getRingArea(double R1, double R2) {
        return Math.PI * (R1 * R1 - R2 * R2);
    }


    public static void task4() {
        if (isLowing(1234567)) {
            System.out.println("Убывающая");
        } else {
            System.out.println("Не убывающая");
        }
    }

    public static boolean isLowing(int n) {
        int last = 0;
        int current = 0;

        do {
            last = current;
            current = n % 10;
            n = n / 10;
        } while (n > 0 && current > last);

        if (n > 0) {
            return false;
        } else {
            return true;
        }

    }


    public static void task5() {
        System.out.println("Среднее арифметичесоке " + average(222222));
        System.out.println("Среднее геометрическое " + averageGeom(234561));
    }

    public static double average(int n) {
        int sum = 0;
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum = sum + d;
            count++;
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public static double averageGeom(int n) {
        int p = 1;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            p = p * d;
        }
        return Math.sqrt(p);
    }

    public static void task6() {
        System.out.println("Реверсированное число " + reverse(9996666));
    }

    public static int reverse(int n) {
        int num = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            num = num * 10 + d;
        }
        return num;
    }

    public static void task7() {
        int a = 18;
        int b = 7;
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a + " " + b);
    }

    public static void task21() throws IOException {
        printTriangleDate(2, 3, 6, 4, 7, 3);
    }

    public static double length(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return d;
    }

    public static boolean isRightTriangle(double d1, double d2, double d3) {
        if (Math.pow(d1, 2) == Math.pow(d2, 2) + Math.pow(d3, 2) ||
                Math.pow(d2, 2) == Math.pow(d1, 2) + Math.pow(d3, 2) ||
                Math.pow(d3, 2) == Math.pow(d1, 2) + Math.pow(d2, 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(double d1, double d2, double d3) {
        if (d1 < d2 + d3 && d2 < d1 + d3 && d3 < d1 + d2) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTriangleDate(double x1, double y1, double x2, double y2, double x3, double y3) {
        double d1 = Main.length(x1, y1, x2, y2);
        double d2 = Main.length(x1, y1, x3, y3);
        double d3 = Main.length(x2, y2, x3, y3);
        if (isTriangle(d1, d2, d3)) {
            System.out.println("это треугольник");
        } else {
            System.out.println("не треугольник");
        }
        if (isRightTriangle(d1, d2, d3)) {
            System.out.println("треугольник прямоугольный");
        } else {
            System.out.println("не прямоугольный");
        }
    }


    public static void task22() {
        int headCount = getHeadCount(250);
        System.out.println("Количество голов равно " + headCount);
        System.out.println("Количество глаз равно " + getEyesCount(headCount));
    }

    public static int getHeadCount(int age) {
        final int YOUNG = 200;
        final int OLD = 300;
        final int NUMBER_HEAD_YOUNG = 3;
        final int NUMBER_HEAD_OLD = 2;
        int headCount = 3;
        if (age < YOUNG) {
            headCount = headCount + NUMBER_HEAD_YOUNG * age;
        } else if (age >= YOUNG && age < OLD) {
            headCount = headCount + (age - YOUNG) * NUMBER_HEAD_OLD + YOUNG * NUMBER_HEAD_YOUNG;
        } else if (age >= OLD) {
            headCount = headCount + (age - OLD) + (OLD - YOUNG) * NUMBER_HEAD_OLD + YOUNG * NUMBER_HEAD_YOUNG;
        }
        return headCount;
    }

    public static int getEyesCount(int headCount) {
        int eyes = 2;
        int eyesCount = eyes * headCount;
        return eyesCount;
    }

    public static void task23() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (isVowel4(s)) {
            System.out.println("гласная");
        } else {
            System.out.println("не гласная");
        }
    }

    public static boolean isVowel1(String s) throws IOException {
        s = s.toLowerCase();
        if (s.equals("а") || s.equals("о") || s.equals("у") || s.equals("ы") ||
                s.equals("э") || s.equals("я") || s.equals("е") || s.equals("ё") || s.equals("ю") || s.equals("и")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowel2(String s) throws IOException {
        String str = "аоуыэяеёюи";
        s = s.toLowerCase();
        if (str.contains(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowel3(String s) throws IOException {
        int[] array = {1072, 1077, 1080, 1086, 1091, 1099, 1101, 1102, 1103};
        s = s.toLowerCase();
        char[] s1 = s.toCharArray();
        int num = (int) s1[0];
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel4(String s) throws IOException {
        s = s.toLowerCase();
        Pattern p = Pattern.compile("[аоуыэяеёюи]+");
        Matcher m = p.matcher(s);
        if (m.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void task24() {
        System.out.println(nextData(29, 2, 1904));
    }

    public static String nextData(int day, int month, int year) {
        final int MONTH_PER_YEAR = 12;
        String result = "";
        if (day <= dayPerMonth(month, year)) {
            if (day == dayPerMonth(month, year)) {
                day = 1;
                if (month < MONTH_PER_YEAR) {
                    month++;
                } else {
                    month = 1;
                    year++;
                }
            } else {
                day++;
            }
            result = day + "." + month + "." + year;
        } else {
            result = "в этом месяце " + dayPerMonth(month, year) + " дней";
        }
        return result;
    }

    public static int dayPerMonth(int month, int year) {
        int countDayMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            countDayMonth = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            countDayMonth = 30;
        }
        if (month == 2) {
            countDayMonth = leapOrNo(year);
        }
        return countDayMonth;
    }

    public static int leapOrNo(int year) {
        int countDayInFeb = 0;
        if (year % 4 != 0) {
            countDayInFeb = 28;
        } else if (year % 100 != 0) {
            countDayInFeb = 29;
        } else if (year % 400 == 0) {
            countDayInFeb = 29;
        } else {
            countDayInFeb = 28;
        }
        return countDayInFeb;
    }
}




