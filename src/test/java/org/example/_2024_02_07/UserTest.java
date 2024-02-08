package org.example._2024_02_07;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private static final Item APPLE = new Item("apple", 2.5, 5);
    private Item mango = new Item("mango", 2.0, 5);
    private Item banana = new Item("banana", 1.99, 4);
    private User user;

    @BeforeEach
    void setUp(){
        Category fruits = new Category("fruits", new Item[]{APPLE, mango, banana});
        Item rom = new Item("rom", 12, 5);
        Item beer = new Item("beer", 1.7, 4);
        Category alcohol = new Category("alcohol", new Item[]{rom, beer});
        Basket basket = new Basket(new Item[]{banana, rom});
        user = new User("Yevgeniia", "12345", basket);
    }

    @AfterEach
    void tearDown() {
        user = null;
    }

    @Test
    void getTotalOfBasket() {
        //given
        double expected = 13.99;

        //when
        double actual = user.getTotalOfBasket();

        //then
        Assertions.assertEquals(expected, actual);
    }
}