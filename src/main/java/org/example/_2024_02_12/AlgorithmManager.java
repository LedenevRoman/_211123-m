package org.example._2024_02_12;

public class AlgorithmManager {
    private int algorithmId;
    private String string;

    public AlgorithmManager(int algorithmId, String string) {
        if (algorithmId < 1 || algorithmId > 2) {
            System.out.println("Error");
        } else {
            this.algorithmId = algorithmId;
            this.string = string;
        }
    }

    public int[] getResult() {
        if (algorithmId == 1) {
            WordsCounter wordsCounter = new WordsCounter(string);
            int[] result = new int[1];
            result[0] = wordsCounter.countWords();
            return result;
        }
        if (algorithmId == 2) {
            LettersCounter lettersCounter = new LettersCounter(string);
            return lettersCounter.countLetters();
        }
        return new int[]{-1};
    }
}
