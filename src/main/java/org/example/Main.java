package org.example;

import org.example._2024_02_01.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan Ivanov", 30);
        Person person2 = new Person("Ivan Ivanov", 30);

        String string1 = new String("Hello");
        String string2 = new String("Hello");

        System.out.println(string1.equals(string2));

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }

    public static int[] getMinEven(int[] myList) {
        int[] array = new int[2];
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList.length - i - 1; j++) {
                if (myList[j] > myList[j + 1]) {
                    int temp = myList[j];
                    myList[j] = myList[j + 1];
                    myList[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = myList[i];
        }
        return array;
    }

    public static int[] getMinElement(int[] myList) {
        int[] array1 = new int[2];
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] > myList[i]) {
                    array1[j] = myList[i];
                    j = i++;
                }
            }
        }
        return array1;
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

}