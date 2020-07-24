package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        double womanHeight = 160;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 160 is " + woman);
    }
}
