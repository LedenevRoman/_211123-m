package org.example._2024_02_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslationApp {
    private static final Map<String, String> translationMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char anotherTranslation;
        do {
            System.out.println("Enter word to translate:");
            String englishWord = scanner.nextLine();
            if (!translationMap.containsKey(englishWord)) {
                System.out.println("Have no such word in dictionary. \n" +
                        "Please enter the translation of this word: ");
                String russianWord = scanner.nextLine();
                translationMap.put(englishWord, russianWord);
                System.out.println("Done!");
            } else {
                System.out.println(translationMap.get(englishWord));
            }
            System.out.println("Get another translation?  (Y/N)");
            anotherTranslation = scanner.nextLine().charAt(0);
        } while (anotherTranslation == 'Y');
    }
}
