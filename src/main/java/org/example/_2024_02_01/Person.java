package org.example._2024_02_01;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение –“Person <имя> идёт.”, "Person <имя> <возраст> говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */
public class Person {
    private String fullName;
    private int age;

    public Person(){
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Person " + fullName + " идёт.");
    }

    public void talk() {
        System.out.println("Person " + fullName + " " + age + " говорит.");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
