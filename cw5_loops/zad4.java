package Zajavka.zadania.cw5_loops;

public class zad4 {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                System.out.println("czerwony");
            } else if (i % 6 == 1) {
                System.out.println("zielony");
            }else if (i % 6 == 2) {
                System.out.println("niebieski");
            } else if (i % 6 == 3) {
                System.out.println("czarny");
            } else if (i % 6 == 4) {
                System.out.println("zolty");
            } else if (i % 6 == 5) {
                System.out.println("brazowy");
            }

        }
    }
}
