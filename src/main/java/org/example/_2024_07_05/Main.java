package org.example._2024_07_05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        int userInput = 6;

        try {
            System.out.println(arr[userInput]);
            System.out.println("asdf");
            System.out.println("asdf");
            System.out.println("asdf");
            System.out.println("asdf");
            arr = null;
            System.out.println(arr.length);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("index out exception");
        } catch (NullPointerException nullPointerException) {
            System.out.println("nullpointer exception");
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        }



        try {
            doSomething(userInput);
        } catch (GoodNotFoundException exception) {
            System.out.println(exception.getMessage());
        }


        System.out.println("дальнейшее выполнение программы");

    }

    public static void doSomething(int index) {
        int[] myGoods = new int[5];
        myGoods[0] = 0;
        myGoods[1] = 1;
        myGoods[2] = 2;
        myGoods[3] = 3;
        myGoods[4] = 4;

        if (index < 0 || index >= myGoods.length) {
            throw new GoodNotFoundException("404");
        }

    }
}
