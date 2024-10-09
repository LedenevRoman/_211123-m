package org.example._2024_02_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayLinkedComparison {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            int number = new Random().nextInt();
            linkedList.add(number);
            arrayList.add(number);
        }
        System.out.println("Creation time: " + ((System.nanoTime() - startTime) / 1000000.0));
        System.out.println("--------------------------------------");

        startTime = System.nanoTime();
        linkedList.add(5_000_000, 1);
        System.out.println("Linked time: " + ((System.nanoTime() - startTime) / 1000000.0));

        startTime = System.nanoTime();
        arrayList.add(5_000_000, 1);
        System.out.println("Array time: " + ((System.nanoTime() - startTime) / 1000000.0));
    }
}
