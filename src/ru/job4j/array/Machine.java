package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        for (int i = 0; i < COINS.length; i++) {
            while (change >= COINS[i]) {
             change -= COINS[i];
             rsl[size] = COINS[i];
             size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
