package Zajavka.zadania.cw3_operators;

public class zad5 {
    public static void main(String[] args) {
        int digit = 21;
        System.out.println(podzielneczynie(digit));
    }

    public static String podzielneczynie(int arg) {
            if (((arg % 3) == 0) && ((arg % 7) == 0)) {
                return "Jest podzielna przez 3 oraz 7";
            } else if ((arg % 3) == 0) {
                return "Jest podzielne przez 3";
            } else if ((arg % 7) == 0) {
                return "Jest podzielne przez 7";
            } else {
                return "Nie jest podzielna ani przez 3 ani przez 7";
            }
        }
    }

