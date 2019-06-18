package Algorithmization.Block4_decomposition.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Random random = new Random();
        int range = 10;
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point p = new Point(random.nextInt(range), random.nextInt(range));
            points.add(p);
        }
        Map<String, Double> map = new HashMap<>();
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Line line = new Line(points.get(i), points.get(j));
                String s = "(" + String.valueOf(points.get(i).getX()) + "," + String.valueOf(points.get(i).getY()) + ")" + "(" + String.valueOf(points.get(j).getX()) + "," + String.valueOf(points.get(j).getY()) + ")";
                map.put(s, line.length());
            }
        }
        double max = 0.0;
        String coordinates = null;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
            double value = pair.getValue();
            System.out.println(value);
            if (value > max) {
                max = value;
                coordinates = key;
            }
        }
        System.out.println("Max length " + max + " beetween points " + coordinates);
    }
}