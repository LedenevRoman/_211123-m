package org.example._2024_10_09;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 1;
        String operator = "/";
        System.out.println(calculate(num1, operator, num2));
    }

    public static int calculate(int number1, String operator, int number2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                checkZero(number2);
                result = number1 / number2;
                break;
            default:
                result = 0;
        }
        return result;
    }

    private static void checkZero(int number2) {
        if (number2 == 0) {
            System.out.println("Error!");
            System.exit(0);
        }
    }

}
