package org.example._2024_02_12;

public class WordsCounter {
    private String string;

    public WordsCounter(String string) {
        this.string = string;
    }

    public int countWords() {
        String[] strings = string.split(" ");
        int result = strings.length;
        return result;
    }
}
