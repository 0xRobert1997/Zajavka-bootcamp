package Zajavka.zadania.cw6_arrays;

import java.util.Arrays;

public class zad6 {
    public static void main(String[] args) {
        String[] arr = new String[]{"jaja", "arbuzy", "czekolada"};

        for (int i = 0; i < arr.length; i++) {
            String newWord = arr[i].toLowerCase();
            newWord = newWord.replaceFirst(
                    String.valueOf(newWord.charAt(0)),
                    String.valueOf(newWord.charAt(0)).toUpperCase());
            arr[i] = newWord;
        }

        System.out.println(Arrays.toString(arr));
    }
}
