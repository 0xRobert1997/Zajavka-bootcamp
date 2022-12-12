package Zajavka.zadania.cw5_loops;

public class zad5 {
    public static void main(String[] args) {

        myMethod();
    }

    private static void myMethod() {
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);

        for (int i = 10; i < 10000; i++) {

            if (
                    ((i % 2) == 0) ||
                            ((i % 3) == 0) ||
                            ((i % 5) == 0) ||
                            ((i % 7) == 0)
            ) {
                continue;
            }
            System.out.println(i);

        }
    }
}
