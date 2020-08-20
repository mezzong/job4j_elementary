package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShiftOne(Product[] products, int index) {
        if (products.length - 1 == index) {
            products[index] = null;
        } else {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        return products;
    }

    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            leftShiftOne(products, i);
        }
        return products;
    }
}