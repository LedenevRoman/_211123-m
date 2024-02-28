package org.example._2024_02_01;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person vasia = new Person("Vasilii Vasil'ev", 30);
        Person petr = new Person("Petr", 30);

        person.move();
        person.talk();

        person.setFullName("Alex");
        person.setAge(25);

        person.move();
        person.talk();

        System.out.println();

        vasia.talk();
        vasia.move();
    }
}
