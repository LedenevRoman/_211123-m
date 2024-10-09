package org.example;

import org.example._2024_02_01.Person;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan Ivanov", 30);
        Person person2 = new Person("Ivan Ivanov", 30);

        String string1 = new String("Hello");
        String string2 = new String("Hello");

        List<String> strings = new ArrayList<>();
        System.out.println(strings.stream().allMatch(string -> string.equals("aloha")));

        List<Optional<String>> optionals = Arrays.asList(Optional.of("a"), Optional.of("b"), Optional.empty());

        List<String> strings1 = optionals.stream().filter(Optional::isPresent).map(Optional::get).toList();

        System.out.println(strings1);

        System.out.println(string1.equals(string2));

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        findTwoMinEll(new int[]{1,3,2,3,4,5});

        MonthDay monthDay = MonthDay.parse("02-29", DateTimeFormatter.ofPattern("M-d"));
        System.out.println(monthDay);

    }

    public static void findTwoMinEll(int[] arr) {
        int temp1 = Integer.MAX_VALUE;
        int temp2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= temp1) temp1 = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= temp1) && arr[i] < temp2) temp2 = arr[i];
        }
        System.out.println(temp1 + ", " + temp2);
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