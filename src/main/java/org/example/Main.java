package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnUsingWhile(5)));
    }

    public static int[] fibanachiWhile(int number) {
        int num1 = 0, num2 = 1, i = 0;
        int[] result = new int[number];
        while (i < number) {
            result[i] = num1;
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            i++;
        }
        return result;
    }

    public static int[] calculateWithWhile(int[] fibanocci) {
        int i = 0;
        while (i < fibanocci.length) {
            i++;
        }
        return fibanocci;
    }

    public static int[] getTwooLess(int[] myList) {
        int[] twooLess = new int[2];
        int min1;
        int min2;
        int indMin = 0;
        if (myList[0] < myList[1]) {
            min1 = myList[0];
            min2 = myList[1];
        } else {
            min1 = myList[1];
            min2 = myList[0];
        }

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min1) {
                min1 = myList[i];
                indMin = i;
            }
        }
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] <= min2 && j != indMin) {
                min2 = myList[j];
            }
        }
        twooLess[0] = min1;
        twooLess[1] = min2;
        return twooLess;
    }

    public static int[] returnUsingWhile(int n) {
        int[] fibonacci = new int[n];
        int a = 0;
        int b = 1;
        int i = 0;

        while (i < n) {
            fibonacci[i] = a;
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
        return fibonacci;
    }
}