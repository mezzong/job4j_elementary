package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (products.length - 1 == index) {
            products[index] = null;
        } else {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        return products;
    }
}