package org.example._2024_01_22;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 20000;
        int intValue = 3000;
        long longValue = 9123456789123456789l;

        float floatValue = 123.453f;
        double doubleValue = 234.4356;

        char charValue = 'c';


        longValue = byteValue;
        byteValue = (byte) longValue;
        charValue = (char) intValue;
        System.out.println(charValue);

        shortValue = (short) (shortValue + byteValue);

    }
}
