package org.example._2024_02_15;

import java.text.DecimalFormat;

public class Calculator {

    private final String[] history = new String[5];

    public String getResult(String input) {
        int operationsCount = getOperationsCount(input);
        double[] arguments = getArgumentsArray(input, operationsCount);
        char[] operations = getOperationsArray(input, operationsCount);
        String resultString = getResultString(arguments, operations, calculate(input));
        addToHistory(resultString);
        return resultString;
    }

    private double calculate(String input) {
        int plusMinusCount = getPlusMinusCount(input);
        if (plusMinusCount == 0) {
            int operationsCount = getOperationsCount(input);
            double[] arguments = getArgumentsArray(input, operationsCount);
            char[] operations = getOperationsArray(input, operationsCount);
            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                result = calculateOperation(result, operations[i - 1], arguments[i]);
            }
            return result;
        }
        char[] plusMinusOperations = getPlusMinusOperations(input, plusMinusCount);
        String[] partsOfMultiplyAndDivide = getPartsBetweenOperations(input, plusMinusOperations);
        double result = calculate(partsOfMultiplyAndDivide[0]);
        for (int i = 1; i < partsOfMultiplyAndDivide.length; i++) {
            result = calculateOperation(result, plusMinusOperations[i - 1], calculate(partsOfMultiplyAndDivide[i]));
        }
        return result;
    }

    private String[] getPartsBetweenOperations(String input, char[] plusMinusOperations) {
        String[] partsBetween = new String[plusMinusOperations.length + 1];
        int count = 0;
        int startPoint = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                String part = input.substring(startPoint);
                partsBetween[count] = part;
            }
            if (isPlusMinus(input.charAt(i))) {
                String part = input.substring(startPoint, i);
                startPoint = i + 1;
                partsBetween[count] = part;
                count++;
            }
        }
        return partsBetween;
    }

    private char[] getPlusMinusOperations(String input, int plusMinusCount) {
        char[] operations = new char[plusMinusCount];
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isPlusMinus(input.charAt(i))) {
                operations[count] = input.charAt(i);
                count++;
            }
        }
        return operations;
    }

    private int getPlusMinusCount(String input) {
        int operationsCount = 0;
        char[] inputChars = input.toCharArray();
        for (char inputChar : inputChars) {
            if (isPlusMinus(inputChar)) {
                operationsCount++;
            }
        }
        return operationsCount;
    }

    private static boolean isPlusMinus(char inputChar) {
        return inputChar == '+' || inputChar == '-';
    }

    private static int getOperationsCount(String input) {
        int operationsCount = 0;
        char[] inputChars = input.toCharArray();
        for (char inputChar : inputChars) {
            if (isOperationChar(inputChar)) {
                operationsCount++;
            }
        }
        return operationsCount;
    }

    private void addToHistory(String calculationResult) {
        for (int i = history.length - 1; i > 0; i--) {
            history[i] = history[i - 1];
        }
        history[0] = calculationResult;
    }

    public String[] getHistory() {
        return history;
    }

    private static boolean isOperationChar(char inputChar) {
        return inputChar == '+' || inputChar == '-' || inputChar == '*' || inputChar == '/';
    }

    private double[] getArgumentsArray(String input, int countOperations) {
        double[] arguments = new double[countOperations + 1];
        int count = 0;
        int startPoint = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                String argumentString = input.substring(startPoint);
                double argument = Double.parseDouble(argumentString);
                arguments[count] = argument;
            }
            if (isOperationChar(input.charAt(i))) {
                String argumentString = input.substring(startPoint, i);
                startPoint = i + 1;
                double argument = Double.parseDouble(argumentString);
                arguments[count] = argument;
                count++;
            }
        }
        return arguments;
    }

    private char[] getOperationsArray(String input, int countOperations) {
        char[] operations = new char[countOperations];
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isOperationChar(input.charAt(i))) {
                operations[count] = input.charAt(i);
                count++;
            }
        }
        return operations;
    }

    private double calculateOperation(double argument1, char operation, double argument2) {
        return switch (operation) {
            case '+' -> argument1 + argument2;
            case '-' -> argument1 - argument2;
            case '*' -> argument1 * argument2;
            case '/' -> {
                if (argument2 == 0) {
                    System.out.println("Error, division by zero!");
                    System.exit(0);
                }
                yield argument1 / argument2;
            }
            default -> 0;
        };
    }

    private String getResultString(double[] arguments, char[] operations, double result) {
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < arguments.length - 1; i++) {
            if (i == 0) {
                stringBuilder.append(decimalFormat.format(arguments[i]))
                        .append(" ")
                        .append(operations[i])
                        .append(" ")
                        .append(decimalFormat.format(arguments[i + 1]))
                        .append(" ");
            } else {
                stringBuilder.append(operations[i])
                        .append(" ")
                        .append(decimalFormat.format(arguments[i + 1]))
                        .append(" ");
            }
        }
        stringBuilder.append("= ")
                .append(decimalFormat.format(result));
        return stringBuilder.toString();
    }
}
