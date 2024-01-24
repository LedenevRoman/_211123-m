package org.example._2024_01_23;

import java.util.Objects;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Student o) {
        return age == o.age &&
                Objects.equals(name, o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
