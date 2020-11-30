package ru.job4j.pojo;

public class Book {

    private String name;
    private int numPages;

    public Book(String name, int numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
