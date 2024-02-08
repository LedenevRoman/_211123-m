package org.example._2024_02_08;

import org.example._2024_01_25.BubbleSort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class SortAssertionExample {
    public static void main(String[] args) {
        int[] array1 = ClassWork.generateArray(1000000);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.equals(array2, array1));

        LocalDateTime timeStart = LocalDateTime.now();
        Arrays.sort(array1);
        LocalDateTime timeEnd = LocalDateTime.now();
        System.out.println("Quick sort time = " + Duration.between(timeStart, timeEnd).getSeconds());

        timeStart = LocalDateTime.now();
        BubbleSort.bubbleSort(array2);
        timeEnd = LocalDateTime.now();
        System.out.println("Bubble sort time = " + Duration.between(timeStart, timeEnd).getSeconds());
    }
}
