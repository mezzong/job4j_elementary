package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Book book2 = new Book("Thinking in Java", 1168);
        Book book3 = new Book("Head First Java", 720);
        Book book4 = new Book("Core Java", 928);
        Book[] books = {book1, book2, book3, book4};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i]);
            }
        }
    }
}
