package Zajavka.zadania.cw5_loops;

public class zad1 {
    public static void main(String[] args) {
        int silnia = 8;
        int result = 1;

        for (int i = 1; i <= silnia; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
