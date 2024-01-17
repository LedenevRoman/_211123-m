package org.example._2024_01_17;

public class Classwork {
    public static void main(String[] args) {
        Student student1 = new Student("211123-m","Maria", 30);
        Student student2 = new Student();

        int i = 0;

        System.out.println(student1.groupNumber);
        System.out.println(student2.groupNumber);

        student2.groupNumber = "211123-m-be";

        System.out.println(student1.groupNumber);
        System.out.println(student2.groupNumber);

        System.out.println(Student.groupNumber);
    }
}
