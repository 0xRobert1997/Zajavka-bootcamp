package Zajavka.zadania.cw6_arrays;

public class zad2 {
    public static void main(String[] args) {
        String word = "ala";

        char[] wordTable = new char[word.length()];
        char[] wordTableReversed = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordTable[i] = word.charAt(i);
        }

        int j = word.length() - 1;
        for (int i = 0; i < word.length(); i++, j--) {
            wordTableReversed[i] = wordTable[j];
        }

        String stringdosprawdzenia = "";

        for (char character : wordTableReversed) {
            stringdosprawdzenia = stringdosprawdzenia + character;
        }
        System.out.println(stringdosprawdzenia);

        if (stringdosprawdzenia.equals(word)) {
            System.out.println("Yes this is palindrome");
        } else {
            System.out.println("Nope this is not palindrome");
        }
    }
}
