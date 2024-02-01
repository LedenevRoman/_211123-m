package org.example;

import org.example._2024_01_25.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWord("ssearchh firstt word"));
        Car car = new Car();

    }


    public static StringBuilder getWord(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        StringBuilder result = new StringBuilder();
        int indSpace = sb.indexOf(" ");
        for (int i = 0; i < string.length() - 1; i++) {
            int counter = 0;
            for (int j = 0; j < indSpace; j++) {
                if (string.charAt(j) == string.charAt(j + 1)) {
                    counter++;
                }
            }
            if (counter == 0) {
                return result.append(sb.substring(0, indSpace));
            } else {
                sb.delete(0, indSpace + 1);
                indSpace = (sb.toString()).indexOf(" ");
            }
        }
        return result;
    }
    public static String getStringChange(String string) {
        char[] chars = string.toCharArray();
        char[] charsTemp = Arrays.copyOf(chars, chars.length);
        int temp = 1;
        for (int i = 0; i < chars.length / 2; i++) {
            chars[i + temp] = charsTemp[i];
            temp = temp + 1;
        }
        temp = 1;
        for (int i = chars.length - 1; i >= chars.length / 2; i--) {
            chars[i - temp] = charsTemp[i];
            temp = temp + 1;
        }
        String stringNew = String.valueOf(chars);
        return stringNew;
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