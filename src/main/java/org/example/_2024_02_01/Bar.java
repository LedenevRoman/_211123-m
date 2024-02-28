package org.example._2024_02_01;

public class Bar extends Foo {               // 1
    public static void main(String[] args) { // 2
        System.out.println(sum(1, 2));         // 3

        char a = 64;
        System.out.println(a);
    }
}
class Foo {
    static int sum(int x, int y) {
        return x + y;
    }
}
