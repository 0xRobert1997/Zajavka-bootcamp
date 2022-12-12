package Zajavka.zadania.cw5_loops;

public class zad7 {

    public static void main(String[] args) {

        fibo(15);
    }

    private static void fibo(int lenght) {

        lenght = lenght / 3;

        int x = 0;
        int y = 1;
        int z = 2;

        System.out.print(x + ", ");
        System.out.print(y + ", ");
        System.out.print(z + ", ");

        for (int i = 0; i < lenght; i++) {

            x = z + y;
            System.out.print(x + ", ");
            y = x + z;
            System.out.print(y + ", ");
            z = y + x;
            System.out.print(z + ", ");

        }
    }
}
