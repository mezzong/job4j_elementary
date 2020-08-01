package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = max(max(first, second), third);
        return result;
    }

    public static int max(int first, int second) {
        return first > second ? first : second;
    }
}
