package org.example._2024_07_05;

public class Task1 {
    public static void main(String[] args) {
        String userInput = "7123";
        System.out.println(isDoubleNumber(userInput));
        System.out.println(isDoubleNumberByException(userInput));

        if (isDoubleNumberByException(userInput)) {
            double number = Double.parseDouble(userInput);
            number = number * 0.7;
            System.out.println(number);
        }
    }

    public static boolean isDoubleNumber(String string) {
        return string.matches("^\\d+\\.?\\d+"); //регулярное выражение для числа типа дабл
    }

    public static boolean isDoubleNumberByException(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }


}
