package org.example._2024_02_13;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    public int[] getRandomLottery() {
        int[] result = new int[5];
        int i = 0;
        while (i < result.length) {
            result[i] = generateRandomNumber();
            for (int j = 0; j < i; j++) {
                if (result[i] == result[j]) {
                    i--;
                }
            }
            i++;
        }
        return result;
    }

    public String getResultMessage(int[] userNumbers, int[] luckyNumbers) {
        if (isWinner(userNumbers, luckyNumbers)) {
            return "WINNER!!!";
        } else {
            return  "You lost :( \n" +
                    "Try again.";
        }
    }

    private boolean isWinner(int[] userNumbers, int[] luckyNumbers) {
        int[] luckyNumbersCopy = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        for (int number : userNumbers) {
            for (int j = 0; j < luckyNumbersCopy.length; j++) {
                if (number == luckyNumbersCopy[j]) {
                    luckyNumbersCopy[j] = 0;
                    break;
                }
                if (j == luckyNumbersCopy.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private int generateRandomNumber() {
        return RANDOM.nextInt(5) + 1;
    }
}
