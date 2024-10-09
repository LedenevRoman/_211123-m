package org.example._2024_02_08;

import org.example._2024_01_25.BubbleSort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class SortAssertionExample {
    public static void main(String[] args) {
        int[] array1 = ClassWork.generateArray(100000);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.equals(array2, array1));

        long timeStart = System.currentTimeMillis();
        Arrays.sort(array1);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Quick sort time = " + (timeEnd - timeStart) / 1000.0 + " seconds");

        timeStart = System.currentTimeMillis();
        BubbleSort.bubbleSort(array2);
        timeEnd = System.currentTimeMillis();
        System.out.println("Bubble sort time = " + (timeEnd - timeStart) / 1000.0 + " seconds");
    }
}
