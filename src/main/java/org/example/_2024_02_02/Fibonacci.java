package org.example._2024_02_02;

public class Fibonacci {
    private int numberOfFibonacciNumbers;

    public Fibonacci() {
    }

    public Fibonacci(int numberOfFibonacciNumbers) {
        if (numberOfFibonacciNumbers >= 0) {
            this.numberOfFibonacciNumbers = numberOfFibonacciNumbers;
        } else {
            System.out.println("Error! Fibonacci Sequence cannot be negative");
        }
    }

    public int[] getSequenceFor() {
        int[] fibonacciSequence = new int[numberOfFibonacciNumbers];
        if (numberOfFibonacciNumbers > 1) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < numberOfFibonacciNumbers; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence;
    }

    public int[] getSequenceWhile() {
        int[] fibonacciSequence = new int[numberOfFibonacciNumbers];
        if (numberOfFibonacciNumbers > 1) {
            fibonacciSequence[1] = 1;
        }
        int i = 2;
        while (i < numberOfFibonacciNumbers) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            i++;
        }
        return fibonacciSequence;
    }

    public int[] getSequenceDoWhile() {
        int[] fibonacciSequence = new int[numberOfFibonacciNumbers];
        if (numberOfFibonacciNumbers > 1) {
            fibonacciSequence[1] = 1;
        }
        if (numberOfFibonacciNumbers > 2) {
            int i = 2;
            do {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
                i++;
            } while (i < numberOfFibonacciNumbers);
        }
        return fibonacciSequence;
    }

    public void setNumberOfFibonacciNumbers(int numberOfFibonacciNumbers) {
        if (numberOfFibonacciNumbers >= 0) {
            this.numberOfFibonacciNumbers = numberOfFibonacciNumbers;
        } else {
            System.out.println("Error! Fibonacci Sequence cannot be negative");
        }
    }

    public int getNumberOfFibonacciNumbers() {
        return numberOfFibonacciNumbers;
    }
}
