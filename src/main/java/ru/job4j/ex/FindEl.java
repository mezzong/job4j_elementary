package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int i = 0;
        for (String s :
                value) {
            if (s.equals(key)) {
                rsl = i;
                break;
            }
            i++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] values = {"a1", "b2", "c3", "d4", "e5"};
        try {
            int rsl = indexOf(values, "e5");
            System.out.println(rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
