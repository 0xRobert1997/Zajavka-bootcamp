package Zajavka.zadania.cw4_conditionals;

public class zad2 {
    public static void main(String[] args) {
        int a, b, c;
        a = 9;
        b = 8;
        c = 7;

        if (a > b && a >c) {
            System.out.println("A jest najwieksze");
        } else if (b > a && b > c) {
            System.out.println("B jest najwieksze");
        } else {
            System.out.println("C jest najwieksze");
        }

    }
}
