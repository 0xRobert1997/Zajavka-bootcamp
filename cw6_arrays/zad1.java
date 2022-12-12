package Zajavka.zadania.cw6_arrays;

public class zad1 {
    public static void main(String[] args) {

        String word = "jebacdisa";

        char[] wordTable = new char[word.length()];
        char[] wordTableReversed = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordTable[i] = word.charAt(i);
        }

        int j = word.length() - 1;
        for (int i = 0; i < word.length(); i++, j--) {
            wordTableReversed[i] = wordTable[j];
        }
        System.out.println(wordTableReversed);
    }
}
