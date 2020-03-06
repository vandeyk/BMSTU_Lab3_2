package com.company;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String [] author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String cover;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public String getCover() {
        return cover;
    }

    public Book(int i, String n, String [] a, String p, int y, int pgs, int prc, String c){
        this.id = i;
        this.name = n;
        this.author = a;
        this.publisher = p;
        this.year = y;
        this.pages = pgs;
        this.price = prc;
        this.cover = c;
    }
}
