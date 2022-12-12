package Zajavka.zadania.cw5_loops;

public class zad6 {

    public static void main(String[] args) {


        myMethod(100);
    }

    private static void myMethod(int lenght) {

        lenght = lenght / 2;

        int a = 39;
        int b = 11;

        for (int i = 0; i < lenght; i++) {
            System.out.print(a + ", ");
            System.out.print(b);
            if (i < (lenght - 1)) {
                System.out.print(", ");
            }
            a += 2;
            b -= 3;
        }


    }
}
