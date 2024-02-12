package org.example._2024_02_12;

import java.util.Arrays;

/**
 * Написать программу, которая в зависимости от входных параметров считает либо количество слов в строке,
 * либо количество букв в каждом слове в виде массива
 *
 * Пример: ввод 1 Hello World - вывод 2
 *         ввод 2 Hello World - вывод [5, 5]
 */
public class Main {
    public static void main(String[] args) {
        int algorithmId = 1234;
        String string = "Hello World Test Aloha";
        AlgorithmManager algorithmManager = new AlgorithmManager(algorithmId, string);
        System.out.println(Arrays.toString(algorithmManager.getResult()));
    }
}
