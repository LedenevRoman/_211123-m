package org.example._2024_01_24;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] array3;
        int[] array4 = {10, 6, 1, 8, 2, 5, 8, 4, 5, 9};
        int[] array5 = {7, 6, 5, 4, 3, 2, 1, 0};

        //Arrays.fill() - заполнение массива одним значением
        Arrays.fill(array1, 8);

        //Arrays.copyOf() - копирование исходного массива в новый массив, с новой длинной массива
        array3 = Arrays.copyOf(array2, 4);
        printArray(array3);

        //Arrays.copyOfRange() - копирование нужных нам элементов массива
        array3 = Arrays.copyOfRange(array2, 3, 4);
        printArray(array3);

        //Arrays.sort() - сортировка массива, по возрастанию
        Arrays.sort(array4);
        printArray(array4);

        //Arrays.binarySearch() - находит индекс искомого элемента в массиве
        int index = Arrays.binarySearch(array4, 10);
        System.out.println(index);

        //Arrays.equals() - сравнение двух массивов между собой, с учётом порядка элементов
        System.out.println(Arrays.equals(array5, array2));
        Arrays.sort(array5);
        System.out.println(Arrays.equals(array5, array2));

    }

    //Arrays.toString() - печать массива
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
