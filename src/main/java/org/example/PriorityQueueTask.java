package org.example;

import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {

    }
}

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
    
}

class Priorities {
    private PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();
}