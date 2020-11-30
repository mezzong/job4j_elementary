package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        boolean run = true;
        Scanner input = new Scanner(System.in);
        int matches = 11;
        while (run) {
            for (int i = 1; i < 3; i++) {
                System.out.println("Игрок " + i);
                int choice = Integer.valueOf(input.nextLine());
                if (choice > 0 && choice < 4) {
                    matches -= choice;
                } else {
                    System.out.println("Выберите от 1 до 3 спичек");
                }
                if (matches <= 0) {
                    System.out.println("Победил игрок " + i + " !!!");
                    run = false;
                    break;
                }
                System.out.println("Осталось спичек: " + matches);
            }
        }
    }
}
