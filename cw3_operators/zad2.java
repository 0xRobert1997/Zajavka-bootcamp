package Zajavka.zadania.cw3_operators;

public class zad2 {
    public static void main(String[] args) {

        int x = 0;

        if (x == 1) {
            System.out.println("yes x is equal to one");
        } else if (x != 0) {
            System.out.println("nope nope nope");
        } else {
            System.out.println(++x);
        }

        if (x == 1) {
            System.out.println(x-= 1);
        } else {
            System.out.println(x *= 2);
        }


    }
}
