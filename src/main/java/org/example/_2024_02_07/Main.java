package org.example._2024_02_07;

public class Main {
    public static void main(String[] args) {
        Item apple = new Item("apple", 2.5, 5);
        Item mango = new Item("mango", 2.0, 5);
        Item banana = new Item("banana", 1.99, 4);
        Category fruits = new Category("fruits", new Item[]{apple, mango, banana});
        Item rom = new Item("rom", 12, 5);
        Item beer = new Item("beer", 1.7, 4);
        Category alcohol = new Category("alcohol", new Item[]{rom, beer});
        Basket basket = new Basket(new Item[]{banana, rom});
        User user = new User("Yevgeniia", "12345", basket);

        System.out.println(user.getTotalOfBasket());
    }
}
