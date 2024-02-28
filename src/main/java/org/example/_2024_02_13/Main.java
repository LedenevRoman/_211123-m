package org.example._2024_02_13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] userNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < userNumbers.length) {
            System.out.println("Enter number №" + (i + 1));
            userNumbers[i] = scanner.nextInt();
            if (userNumbers[i] > 50 || userNumbers[i] < 1) {
                System.out.println("Wrong number, enter number between 1 and 50.");
                i--;
            }
            i++;
        }

        Lottery lottery = new Lottery();
        int[] luckyNumbers = lottery.getRandomLottery();

        System.out.println(lottery.getResultMessage(userNumbers, luckyNumbers));
        System.out.println("Your  numbers: " + Arrays.toString(userNumbers));
        System.out.println("Lucky numbers: " + Arrays.toString(luckyNumbers));
    }
}
