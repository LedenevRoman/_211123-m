package org.example._2024_01_17;

public class Student {
    static String groupNumber;
    String name;
    int age;

    public Student() {
    }

    public Student(String groupNumber, String name, int age) {
        this.groupNumber = groupNumber;
        this.name = name;
        this.age = age;
    }

    public void learning(){
        System.out.println("Student " + this.name + " is learning Java");
    }
}
