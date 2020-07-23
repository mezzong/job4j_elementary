package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double pa = Math.pow(a, 2);
        double pb = Math.pow(b, 2);
        double rsl = Math.sqrt(pa + pb);

        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 0, 4, 5);
        double result3 = Point.distance(3, 2, 8, 10);

        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 0) to (4, 5) " + result2);
        System.out.println("result (3, 2) to (8, 10) " + result3);
    }
}
