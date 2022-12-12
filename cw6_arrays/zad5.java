package Zajavka.zadania.cw6_arrays;

public class zad5 {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] digits2 = new int[]{9, 8 ,7, 6, 5, 4, 3, 2, 1};

        int counter = 0;
        if (digits.length != digits2.length) {
            System.out.println("Different length, so they are definitely not the same");
        } else {
            for (int i = 0; i < digits.length; i++) {
                for (int j = 0; j < digits2.length; j++) {
                    if (digits[i] != digits2[j]) {
                        continue;
                    } else {
                        counter++;
                    }
                    if (counter == digits.length) {
                        System.out.println("All digits from Table1 are in Table2");
                    }
                }

            }
        }
    }
}
