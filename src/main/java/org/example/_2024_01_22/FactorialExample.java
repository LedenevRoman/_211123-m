package org.example._2024_01_22;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(defaultFactorial(number));
        System.out.println(strangeFactorial(number));
    }

    private static int defaultFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static int strangeFactorial(int number) {
        int result = 1;
        for (; number > 0 ; number /= 10) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            result *= factorial;
        }
        return result;
    }
}
