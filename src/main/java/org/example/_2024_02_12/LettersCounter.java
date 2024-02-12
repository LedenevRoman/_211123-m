package org.example._2024_02_12;

public class LettersCounter {
    private String string;

    public LettersCounter(String string) {
        this.string = string;
    }

    public int[] countLetters() {
        String[] strings = string.split(" ");
        int[] result = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].length();
        }
        return result;
    }
}
