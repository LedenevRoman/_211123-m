package org.example._2024_01_18;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println(1);
            doSomething(scanner.nextInt(), scanner.nextInt());
        } else if (scanner.hasNextDouble()) {
            System.out.println(2);
            doSomething(scanner.nextDouble(), scanner.nextDouble());
        } else {
            System.out.println(3);
            doSomething(scanner.next(), scanner.next());
        }
    }

    public static void doSomething(int a, int b) {
        System.out.println(a + b);
    }

    public static void doSomething(double a, double b) {
        System.out.println(a * b);
    }

    public static void doSomething(String a, String b) {
        System.out.println("!" + a + "!" + b);
    }
}
