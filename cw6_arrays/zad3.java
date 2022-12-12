package Zajavka.zadania.cw6_arrays;

import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        int[] digits = new int[] {1, 2, 3, 4, 5, 6};
        int[] reversedDigits = new int[digits.length];


        int j = digits.length - 1;
        for (int i = 0; i < digits.length; i++, j--) {
            reversedDigits[i] = digits[j];
        }
        System.out.println(Arrays.toString(reversedDigits));
    }
}
