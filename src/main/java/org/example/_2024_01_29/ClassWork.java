package org.example._2024_01_29;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        String string = "Java";
        String string2 = "Java";
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
        System.out.println(Arrays.toString(array));

        System.out.println(string);
        String string1 = "Java".replace('a', 'x');
        System.out.println(string1);

        System.out.println("Java" + " hello");

        System.out.println(string);
        System.out.println(string2);

        String string3 = string.replaceAll("va", "");

        System.out.println(string3);

        String string4 = "Name Surname;age 18";
        String[] nameAndAge = string4.split("a");
        System.out.println(Arrays.toString(nameAndAge));

        System.out.println(string4.substring(5, 12));
        System.out.println("Java".toLowerCase());
        System.out.println("   kjhasdf    ".trim());
        System.out.println(String.join(", ", "Java", "is", "cool"));
    }
}
