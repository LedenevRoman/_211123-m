package org.example._2024_02_07;

public class Item {
    private String name;
    private double price;
    private int rating;

    public Item(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
