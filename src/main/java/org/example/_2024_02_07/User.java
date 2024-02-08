package org.example._2024_02_07;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public double getTotalOfBasket() {
        double sum = 0;
        Item[] selectedItems = basket.getSelectedItems();
        for (Item selectedItem : selectedItems) {
            sum = sum + selectedItem.getPrice();
        }
        return sum;
    }

    public String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

}
