package org.example._2024_02_15;

import org.example._2024_02_01.Person;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char calculationFlag;
        do {
            System.out.println("Enter expression:");
            String input = scanner.nextLine();
            System.out.println(calculator.getResult(input) + "\n");
            System.out.println("History: \n" + Arrays.toString(calculator.getHistory()) + "\n");
            System.out.println("Another calculation? (Y/N)");
            calculationFlag = scanner.nextLine().charAt(0);
            System.out.println();
        } while (calculationFlag == 'Y');

    }
}
